package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import Entities.Concrete.Category;
import Entities.Concrete.Invoice;

public class InMemoryCategoryDao {
	List<Category> _category;
	
	public InMemoryCategoryDao() {
		_category=new ArrayList<Category>();
		
		_category.add(new Category(1,"Kırtasiye"));
		_category.add(new Category(2,"Aksesuar"));
		_category.add(new Category(3,"Giyim"));
	}
	
	public List<Category> getAll(){
		return _category;
	}
}
