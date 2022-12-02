
public class Triangle {
	
	public static void triangle(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=i; j>0; j--) {
				System.out.print('*');
			}
			System.out.print("\n");
		}
	}
	
	
	public static void reversedTriangle(int num) {
		int sayi=num-1;
		for(int i=1;i<=num;i++) {
			
			for(int j=sayi; j>0; j--) {
				System.out.print(' ');
			}
			
			for(int z=i; z>0; z--) {
				System.out.print('*');
			}
			System.out.print("\n");
			sayi--; 
		}
	}
}


