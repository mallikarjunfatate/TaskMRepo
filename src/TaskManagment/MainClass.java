package TaskManagment;

import java.util.ArrayList;

public class MainClass 
{
	public static void main(String[] args) 
	{
		TaskManagment taskManagment = new TaskManagment();
		Order order1 = new Order("1", "A", "Pune",new ArrayList<InventoryItem>());
		DeliveryRoute route1 = new DeliveryRoute("11", new ArrayList<Order>());
		InventoryItem inventoryItem1 = new InventoryItem("111", "Item1", 1001);
		
		taskManagment.addOrder(order1);
		taskManagment.addRoute(route1);
		taskManagment.addInventoryItom(inventoryItem1);
		
		
	}
}
