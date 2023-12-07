package oop1;

public abstract class Newabstract {
	
	abstract void add(int a, int b);
	abstract void add(double a, double b);
	abstract void multi(int x, int y);
	
}
	
	 class Newabstract1 extends Newabstract {

		@Override
		void add(int a, int b) {
			int sum = a+b;
			System.out.println(sum);
			
		}

		@Override
		void add(double a, double b) {
			// TODO Auto-generated method stub
			
		}

		@Override
		void multi(int a, int b) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		
		
	}
  




    class Newabstract2 {
	


     void add(int x, int y, int z) {
		int sum = x+y+z;
		System.out.println(sum);
		
	}
	
	 void div(int x, int y) {
		int result = x/y;
		System.out.println(result);
	}
	

	
	public static void main(String[] args) {
		 
	//Newabstract1 s1 = new Newabstract1();
		//1.add(3, 2);
		
		
		
		
		Newabstract1 n1 = new Newabstract1();
		n1.add(2, 3);
		

	}

}
