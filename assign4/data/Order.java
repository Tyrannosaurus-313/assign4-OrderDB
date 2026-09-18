package data;

public class Order {
	private int id;
	private String customerName;
	private String product;
	private double totalCost;
	private String orderDate;
	
	public void setId(int id) { this.id = id; }
	public void setName(String name) { this.customerName = name; }
	public void setProduct(String product) { this.product = product; }
	public void setCost(double totalCost) { this.totalCost = totalCost; }
	public void setDate(String date) { this.orderDate = date; }

	public int getId() { return id; }
	public String getName() { return customerName; }
	public String getProduct() { return product; }
	public double getCost() { return totalCost; }
	public String getDate()	{ return orderDate; }
	
	public Order()	{ }
	public Order(int id, String customerName, String product, double cost, String orderDate) {
		this.id = id;
		this.customerName = customerName;
		this.product = product;
		this.totalCost = cost;
		this.orderDate = orderDate;
	}
	
	public void show() {
		System.out.printf("%-8d %-31s %9.2f\n", id, product, totalCost);
	}	
}
