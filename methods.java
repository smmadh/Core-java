package accessmodifer;

public class methods {
	public void display() {
		System.out.println("hello");
	}
	public void display1() {
		System.out.println("world");
	}
	public void display2(int a,int b) {
		  System.out.println("addition of two number:"+(a+b));
		  System.out.println("sub of two number:"+(a-b));
		  System.out.println("mul of two number:"+(a*b));
		  System.out.println("div of two number:"+(a/b));
	}
	 
	public void eod(int n) {
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}
	
	public int display3() {
	System.out.println("hello");
	return 0;
	}
	
	public int display4(int a,int b) {
		  System.out.println("addition of two number:"+(a+b));
		  return a+b;
	}
	public int display5(int a, int b) {
		  System.out.println("sub of two number:"+(a-b));
		  return a-b;}
	public int display6(int a,int b) {
		  System.out.println("mul of two number:"+(a*b));
		  return a*b;}
	public int display7(int a,int b) {
		  System.out.println("div of two number:"+(a/b));
		  return a/b;
	}
	public static void main(String[] args) {
	  methods ob=new methods();	
	  ob.display();
	  ob.display1();
	  ob.display2(20,30);
	  ob.eod(2);
	  ob.display3();
	  ob.display4(2, 5);
	  ob.display5(10, 40);
	  ob.display6(40, 10);
	  ob.display7(3,5);

	}

}
