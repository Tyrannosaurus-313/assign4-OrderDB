package data;

public class Driver {
	public static void main(String[] args) {
		OrderDB dataBase = new OrderDB();
		dataBase.setOrders(new Order[50]);
		
		dataBase.loadOrders("orders.txt");
		dataBase.showOrders();
	}
}
