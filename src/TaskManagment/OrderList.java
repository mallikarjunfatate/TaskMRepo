package TaskManagment;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class OrderList extends AbstractList<Order>
{
	private List<Order> orders;
	
	public OrderList()
	{
		this.orders = new ArrayList<Order>();		
	}

public Order get(int index)
{
	return orders.get(index);
}
@Override
public int size() 
{
	return orders.size();
}

public void add(int index, Order element)
{
	orders.add(index,element);
}
public Order remove(int index)
{
	return orders.remove(index);
}
}