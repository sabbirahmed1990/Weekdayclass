package variable;

public class Fibonachi1 {

	public static void main(String[] args) {
      // 0 1 1 2 3 5 8 13

       int f1 = 0;
       int f2 = 1;
       int sum = 0;
       
       
       System.out.println(f1);
       System.out.println(f2);
		
       for( int i = 3; i<=10; i++)
       
       
       { sum = f1 + f2;
       f1 = f2;
       f2 = sum;
    		   
		System.out.println(sum);}
		
		
		
		
		
		
		
	}

}
