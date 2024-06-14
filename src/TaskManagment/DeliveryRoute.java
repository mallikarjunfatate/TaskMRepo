package TaskManagment;

import java.util.List;

public class DeliveryRoute 
{
	private String routeId;
    private List<Order> orders;
    
	public DeliveryRoute(String routeId, List<Order> orders)
	{
		super();
		this.routeId = routeId;
		this.orders = orders;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
    
    
}
