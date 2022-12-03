package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import Entities.Concrete.Invoice;

public class InMemoryInvoiceDao {
	List<Invoice> _invoice;
	
	public InMemoryInvoiceDao() {
		_invoice=new ArrayList<>();
		
		_invoice.add(new Invoice(1,1500,1));
		_invoice.add(new Invoice(2,2500,2));
		_invoice.add(new Invoice(3,1250,3));
		_invoice.add(new Invoice(4,500,4));
		_invoice.add(new Invoice(5,825,5));
	}
	
	public List<Invoice> getAll(){
		return _invoice;
	}
}
