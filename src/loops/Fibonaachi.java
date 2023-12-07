package loops;

public class Fibonaachi {

	public static void main(String[] args) {

      // 0 1 1 2 3 5 8 13 21 34 55
		
		
		int x1 = 0;
		int x2 = 1;
		int sum = 0;
		
		System.out.println(x1+" "+x2); 
		
		for( int i = 3; i<=9; i = i+1) {
			
		sum = x1+x2;
		x1 = x2;
		x2 = sum; 
		
		System.out.println(sum);}
		
		
		
		
		
		
		
		
		
		
		

	}

}
