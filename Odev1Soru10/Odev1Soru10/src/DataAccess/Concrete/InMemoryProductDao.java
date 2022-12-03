package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import Entities.Concrete.Invoice;
import Entities.Concrete.Product;

public class InMemoryProductDao {
	
	List<Product> _products;
	
	public InMemoryProductDao() {
		
		_products=new ArrayList<Product>();
		_products.add(new Product(1,"Kalem",10,100,1));
		_products.add(new Product(2,"Silgi",5,200,1));
		_products.add(new Product(3,"Gözlük",25,50,2));
		_products.add(new Product(4,"Saat",20,75,2));
		_products.add(new Product(5,"Gömlek",25,120,3));
		}
	
	public List<Product> getAll(){
		return _products;
	}
		
}

