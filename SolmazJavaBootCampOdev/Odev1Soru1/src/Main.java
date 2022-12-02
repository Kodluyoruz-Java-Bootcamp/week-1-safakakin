import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Long> numbers= new ArrayList<>();
		
		List<Long> numbers2;
		
		long num=0;
		
		long reversedNumb=0;
		
		for(long i=10; i<100;i++) {
			numbers2=new ArrayList<>();
			numbers2.add(i);
			num=i;
			reversedNumb=findTheReverse(num);
			
			while(num!=reversedNumb) {
				numbers2.add(reversedNumb);
				num=num+reversedNumb;
				reversedNumb=findTheReverse(num);
			}
			numbers2.add(reversedNumb);
			if(numbers2.size()>=numbers.size()) {
				numbers=numbers2;
			}
		}
		
		for(long x : numbers) {
			System.out.println(x);
		}
	
	
	}
	static long findTheReverse(long i) {
		long reverse=0;
		while(i!=0) {
			long remainder =i%10;
			reverse=reverse*10+remainder;
			i=i/10;
		}
		return reverse;
	}
}



