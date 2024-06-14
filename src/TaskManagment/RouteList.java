package TaskManagment;

import java.util.AbstractSequentialList;
import java.util.LinkedList;
import java.util.ListIterator;
public class RouteList extends AbstractSequentialList<DeliveryRoute>
{
	private LinkedList<DeliveryRoute> routes ;
	RouteList()
	{
		this.routes = new LinkedList<>();
	}

	@Override
	public int size() 
	{
		return routes.size();
	}

	@Override
	public ListIterator<DeliveryRoute> listIterator(int index) 
	{
		return routes.listIterator(index);
	}

	
}
