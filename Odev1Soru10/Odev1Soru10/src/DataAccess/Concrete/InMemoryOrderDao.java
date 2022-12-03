package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import Entities.Concrete.Invoice;
import Entities.Concrete.Order;

public class InMemoryOrderDao {
	List<Order> _order;
	
	public InMemoryOrderDao(){
		List<Integer> productIdList = new ArrayList<>();
		productIdList.add(1);
		List<Integer> productIdList2 = new ArrayList<>();
		productIdList2.add(2);
		productIdList2.add(3);
		
		_order =new ArrayList<>();
		_order.add(new Order(1,1,1,productIdList));
		_order.add(new Order(2,2,3,productIdList));
	}
	public List<Order> getAll(){
		return _order;
	}
	
}
