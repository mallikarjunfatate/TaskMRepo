package TaskManagment;

import java.util.List;

public class Order
{
	private String orderId;
	private String customerName;
	private String address;
	private List<InventoryItem> items;
	
	public Order(String orderId, String customerName, String address, List<InventoryItem> items)
	{
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.address = address;
		this.items = items;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<InventoryItem> getItems() {
		return items;
	}

	public void setItems(List<InventoryItem> items) {
		this.items = items;
	}
	
	

}
