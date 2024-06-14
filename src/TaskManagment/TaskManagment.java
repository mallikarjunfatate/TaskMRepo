package TaskManagment;

import java.util.ArrayList;
import java.util.List;

public class TaskManagment 
{
	private OrderList orderList;
	private RouteList routeList;
	private List<InventoryItem> inventory;
	
	public TaskManagment() 
	{
		this.orderList = new OrderList();
		this.routeList = new RouteList();
		this.inventory = new ArrayList<InventoryItem>();
	}
	public void addOrder(Order order)
	{
		orderList.add(order);
		System.out.println("Order added Successfully ! and Order id : "+ order.getOrderId());
	}
	public void addRoute(DeliveryRoute route)
	{
		routeList.add(route);
		System.out.println("route added successfully ! and id : "+ route.getRouteId());
	}
	public void addInventoryItom(InventoryItem item)
	{
		inventory.add(item);
		System.out.println("Inventory Itom add Successfully ! and id : "+ item.getItemId());
	}
	
	public void processOrder(String orderId) 
	{
        // Implementation for order processing
        System.out.println("Processing order: " + orderId);
    }

    public void planDeliveryRoute(String routeId) 
    {
        // Implementation for planning delivery route
        System.out.println("Planning delivery route: " + routeId);
    }

    public void manageInventory() 
    {
        // Implementation for inventory management
        System.out.println("Managing inventory");
    }
}
