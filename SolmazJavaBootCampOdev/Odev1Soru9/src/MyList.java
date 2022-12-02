
public class MyList{
	
	//Liste işlemlerini gerçekleştireceğimiz dizi değişkenidir.
	private String[] stringArray;
	
	//Liste içerisindeki mevcut eleman sayısını tutar.
	private int size;
	
	//Başlangıç kapasiteni belirleyen değişkendir.
	private static final int DEFAULT_CAPACITY=5;
	
	//Dizi'nin kapasitenin dolması durumunda kapasiteyi arttırmak 
	//üzere kullanacağımız değişkendir.
	private static final int INCREASE_CAPACITY=7;
	
	//Dizi değişken örneğinin başlangıç kapasitesinde oluşturulmasını sağlamak için
	//Yapıcı method kullanıldı. Alternatif olarak dizi değişkeni tanımlanırken doğrudan başlangıç
	//kapasitesinde de oluşturulabilir.
	// private String[] stringArray= new String[5];
	public MyList(){
		stringArray=new String[DEFAULT_CAPACITY];
	}
	
	//String parametre alan ve geriye değer döndürmeyen ekleme metodu tanımlandı.
	//İlk yapılması gereken gönderilen String parametrenin 'C' harfi 
	//ile başlayıp başlamadığını kontrol etmek olmalıdır. 
	//İlk harfi seçmek üzere dizi indexi kullanmak için gönderilen String parametre 
	//.toCharArray methodu ile değişkene atanmadan Char dizisine dönüştürülür ve 0'ıncı
	//index'de bulunan elemanın 'C' harfi olup olmadığı sorgulanır.
	//Eğer sorgu doğru ise gönderilen parametre dizinin ilk boş indexini tutan "size" 
	//değişkeni kullanılarak ilk boş indexe atanır. Size değişkeni bir arttırılarak 
	//sonraki ekleme işlemi için ilk boş indexi tutması sağlanır. 
	//İşlem sonrası dizide boş yer olup olmadığı sorgulanır.
	//Eğer boş yer yoksa kapasitesi mevcut dizinin kapasitesi + arttırılmak istenilen kapasite(7)
	//olacak şekilde geçici bir dizi oluşturulur. For döngüsü yardımıyla ana dizideki elemanlar
	//geçici diziye atanır. İşlem bittiğinde ana dizi=geçici dizi eşitliği ile ana dizininin 
	//geçici dizi ile aynı referansı tutması sağlanır. Böylece ana dizinin kapasitesi arttırılmış 
	//olur.
	public void add(String text) {
		
		if(text.toCharArray()[0]=='C') {
			stringArray[size]=text;
			size++;
			if(size==stringArray.length) {
				String[] tempArray=new String[stringArray.length+INCREASE_CAPACITY];
				for(int i=0; i<stringArray.length;i++) {
					tempArray[i]=stringArray[i];
				}
				stringArray=tempArray;
			}
		}
		
	}
	
	//For döngüsü ana dizideki eleman sayısı kadar döndürülerek bütün
	//elemanların konsola yazdırılması sağlanır. Dizinin kapasitesi 
	// tam dolu değilse ve döngü kapasite kadar döndürülürse(foreach kullanımı)
	// değer atanmamış indexler null değer döndürecektir. Bu sebeple for döngüsü 
	// mevcut eleman sayısı kadar döndürülmelidir.
	public void print() {
		for(int i=0; i<size;i++) {
			System.out.println(stringArray[i]);
		}
	}

}

