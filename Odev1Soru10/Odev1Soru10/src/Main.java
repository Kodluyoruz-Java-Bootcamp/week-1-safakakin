import DataAccess.Concrete.InMemoryCustomerDao;
import DataAccess.Concrete.InMemoryInvoiceDao;
import DataAccess.Concrete.InMemoryOrderDao;
import Entities.Concrete.Customer;
import Entities.Concrete.Invoice;
import Entities.Concrete.Order;

public class Main {

	public static void main(String[] args) {
		
		InMemoryCustomerDao customerDao= new InMemoryCustomerDao();
		InMemoryOrderDao orderDao=new InMemoryOrderDao();
		InMemoryInvoiceDao invoiceDao=new InMemoryInvoiceDao();
		
		//Sistemdeki bütün müşteri sayısını bulsun.
		
		System.out.println(customerDao.getAll().size());
		
		//İsmi Cem olan müşterilerin aldıkları ürün sayısını bulan,
		
		int productCount=0;
		
		for(Order x : orderDao.getAll()) {
			for(Customer y : customerDao.getAll()) {
				if(x.getCustomerId()==y.getCustomerId() && y.getCustomerName()=="Cem")
				{
					productCount+=x.getProductId().size();
				}
			}
		}
		
		System.out.println(productCount);
		
		//İsmi Cem olup yaşı 30’dan küçük 25’ten büyük müşterilerin toplam alışveriş tutarını hesaplayın,
	
	int sumAmount=0;
	
	for(Customer x : customerDao.getAll()) {
		if(x.getCustomerName()=="Cem" && x.getCustomerAge()>25 && x.getCustomerAge()<30){
			for(Integer y : x.getOrderId()) {
				for(Invoice z : invoiceDao.getAll()) {
					
					if(y==z.getOrderId())
					{
						sumAmount+=z.getInvoiceAmount();
					}
				}
			}
		}
	}
	
	System.out.println(sumAmount);
	
	//Sistemdeki 1500 TL üzerindeki faturaları listeleyin
	
	for(Invoice x : invoiceDao.getAll()) {
		if(x.getInvoiceAmount()>1500)
		{
			System.out.println("InvoiceId: "+x.getInvoiceId()+" InvoiceAmount: "+x.getInvoiceAmount()+" OrderId: "+x.getOrderId());
		}
	}
	
	}
}





	
	
	

