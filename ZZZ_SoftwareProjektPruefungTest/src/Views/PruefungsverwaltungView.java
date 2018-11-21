package Views;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Models.PruefungslisteModel;

public class PruefungsverwaltungView implements Models.Observer {

	private PruefungslisteModel pl_model;
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JList liste;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTable table;
	private DefaultTableModel tableModel;

	public PruefungsverwaltungView(PruefungslisteModel model) {
		pl_model = model;
		pl_model.register(this);
		createComponents();
	}

	public void createComponents() {

		frame.setTitle("Prüfungsverwaltung");
		frame.setSize(400, 200);
		
		int[] pruefungsnummer = new int[pl_model.getPruefungsliste().size()];
		for(int i=0; i<pl_model.getPruefungsliste().size(); i++){
			pruefungsnummer[i] = (pl_model.getPruefungsliste().get(i).getPruefungsnummer());
		}
		
		String[] pruefungstitel = new String[pl_model.getPruefungsliste().size()];
		for (int i = 0; i < pl_model.getPruefungsliste().size(); i++) {
			pruefungstitel[i] = (pl_model.getPruefungsliste().get(i).getPruefungstitel());
		}
		panel.setLayout(new BorderLayout(0, 0));

		frame.getContentPane().add(panel);
		scrollPane.setBackground(SystemColor.inactiveCaption);

		panel.add(scrollPane, BorderLayout.CENTER);
		
		tableModel = new DefaultTableModel(new Object[]{"Nummer", "Prüfungstitel", "Dauer"}, pl_model.getPruefungsliste().size());
		for(int i=0; i<pl_model.getPruefungsliste().size(); i++){
			tableModel.setValueAt(pl_model.getPruefungsliste().get(i).getPruefungsnummer(), i, 0);
		}
		for(int i=0; i<pl_model.getPruefungsliste().size(); i++){
			tableModel.setValueAt(pl_model.getPruefungsliste().get(i).getPruefungstitel(), i, 1);
		}
		for(int i=0; i<pl_model.getPruefungsliste().size(); i++){
			tableModel.setValueAt(pl_model.getPruefungsliste().get(i).getPruefungsdauer(), i, 2);
		}
		
//		tableModel.setColumnIdentifiers(new Object[]{"Nummer", "Prüfungstitel", "Dauer"});
//		for( int r = 0; r < pl_model.getPruefungsliste().size(); r++ ){
//            Object[] row = new Object[ tableModel.getColumnCount() ];
//            
//            for( int c = 0; c < row.length; c++ ){
//                row[c] = pl_model.getPruefungsliste().get(r).getPruefungsnummer();
//            }
//            
//            tableModel.addRow( row );
//        }
		
		table = new JTable(tableModel);
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		table.setBackground(SystemColor.inactiveCaption);
		table.setDefaultEditor(Object.class, null);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				JTable table = (JTable) evt.getSource();
				if (evt.getClickCount() == 2) {
					int selectedRow = table.getSelectedRow();
					PruefungsDetailsView a_view = new PruefungsDetailsView(pl_model.getPruefungsliste().get(selectedRow));
				}
			}
		});
		
		scrollPane.setViewportView(table);
		frame.setVisible(true);
		frame.pack();

	}

	public void update() {
		// TODO Auto-generated method stub

	}

}
