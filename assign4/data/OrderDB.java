package data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class OrderDB
{	
	private Order[] orders;
	
	public void setOrders(Order[] orders) { this.orders = orders; }
	public Order[] getOrders() { return orders; }
	
	public void loadOrders(String fileName) {
		int count = 0;
		try {
			Scanner scnr = new Scanner(new FileReader(fileName));
			scnr.useDelimiter(",");
			scnr.nextLine();
			String[] currLine;
			
			Order currOrder;
			while (scnr.hasNext() && count < orders.length) {
				currLine = scnr.nextLine().split(",");
				currOrder = new Order(
						Integer.parseInt(currLine[0]),
						currLine[1],
						currLine[2],
						Double.parseDouble(currLine[3]),
						currLine[4]);
				
				orders[count] = currOrder;
				count++;
			}
			scnr.close();
		}
		catch (FileNotFoundException ex) {
			ex.printStackTrace();				
		}
		catch (Exception ex) {
			ex.printStackTrace();				
		}
	}	
	
	public void showOrders() {
		System.out.printf("Order ID Product                         Total Amt\n");
		System.out.printf("-------- -------                         ---------\n");
		for (int i = 0; i < orders.length && orders[i] != null; i++)
		{
			orders[i].show();
		}
	}
}
