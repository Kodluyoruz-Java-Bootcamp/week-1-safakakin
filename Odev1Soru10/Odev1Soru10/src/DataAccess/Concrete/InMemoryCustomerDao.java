package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import Entities.Concrete.Customer;
import Entities.Concrete.Invoice;

public class InMemoryCustomerDao {
	List<Customer> _customer;
	
	public InMemoryCustomerDao(){
		List<Integer> orderIdList1 = new ArrayList<>();
		orderIdList1.add(1);
		orderIdList1.add(2);
		List<Integer> orderIdList2 = new ArrayList<>();
		orderIdList1.add(3);
		orderIdList1.add(4);
		_customer=new ArrayList<>();
		_customer.add(new Customer(1,orderIdList1,27,"Cem"));
		_customer.add(new Customer(2,orderIdList2,28,"Şafak"));
	}
	public List<Customer> getAll(){
		return _customer;
	}
	
}
