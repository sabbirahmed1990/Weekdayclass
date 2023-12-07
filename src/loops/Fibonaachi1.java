package loops;

public class Fibonaachi1 {

	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 13 21 34
		
		int a1 = 0;
		int a2 = 1;
		int sum = 0;
		
		
		System.out.println(a1);
		System.out.println(a2);
		
		for(int i = 3; i<=10; i = i+1) {
			
			sum = a1+a2;
		    a1 = a2;
		    a2 = sum;
		    
		    System.out.println(sum);}
		
		
		}

}
