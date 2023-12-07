package oop;

public class Myinterface implements Abstraction {

	public static void main(String[] args) {
		
		Myinterface m1 = new Myinterface();
		m1.multi(2, 3);
		m1.div(125, 5);

	}

	@Override
	public void sub(int a, int b) {
		int result = a-b;
		System.out.println(result);
		
	}

	@Override
	public void sub(double a, double b) {
       double result = a-b;
       System.out.println(result);
       
		
	}

	@Override
	public void div(int a, int b) {
        int div = a/b;
        System.out.println(div);

		
		
	}

	@Override
	public void multi(int a, int b) {

      int multi = a*b;
      System.out.println(multi);
		
		
	}

}
