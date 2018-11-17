package mvcUntersuchen;

public class MVCTestDrive {
	public static void main(String[] args) {
		DataModel model = new DataModel();
		TableView tableView = new TableView(model);
		AndereView andereView = new AndereView(model);
		// PieChartView pieChartView = new PieChartView(model);
		// BarChartView barChartView = new BarChartView(model);
	}
}
