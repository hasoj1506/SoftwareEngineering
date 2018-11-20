package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import model.PruefungslisteModel;
import model.Observer;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JTable;

public class PruefungsverwaltungView implements Observer {

	private PruefungslisteModel pl_model;
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JList liste;
	private JLabel label = new JLabel("Wählen Sie die Prüfung:");
	private final JScrollPane scrollPane = new JScrollPane();
	private final JTable table = new JTable();
	private DefaultTableModel tableModel;

	public PruefungsverwaltungView(PruefungslisteModel model) {
		pl_model = model;
		pl_model.register(this);
		createComponents();
	}

	public void createComponents() {

		frame.setTitle("Prüfungsverwaltung");
		frame.setSize(400, 200);

		String[] listeString = new String[pl_model.getPruefungsliste().size()];
		for (int i = 0; i < pl_model.getPruefungsliste().size(); i++) {
			listeString[i] = (pl_model.getPruefungsliste().get(i).getPruefungstitel());
		}
		panel.setLayout(new BorderLayout(0, 0));

		frame.getContentPane().add(panel);

		panel.add(scrollPane, BorderLayout.CENTER);

		scrollPane.setViewportView(table);
		

		liste = new JList(listeString);
		panel.add(liste, BorderLayout.SOUTH);
		liste.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				JList list = (JList) evt.getSource();
				if (evt.getClickCount() == 2) {
					int index = list.locationToIndex(evt.getPoint());
					PruefungsdetailsView a_view = new PruefungsdetailsView(pl_model.getPruefungsliste().get(index));
				}
			}
		});
		frame.getContentPane().add(label, BorderLayout.NORTH);
		frame.setVisible(true);
		frame.pack();

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
