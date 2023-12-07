package oop1;

public class Myabstract extends Newabstract {

	public static void main(String[] args) {
        
		Myabstract m1 = new Myabstract();
		


	}

	@Override
	void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		
	}

	@Override
	void add(double a, double b) {
         double sum = a+b;
         System.out.println(sum);
        
		
	}

	@Override
	void multi(int x, int y) {
         int result = x*y;
         System.out.println(result);
       
		
	}

}
