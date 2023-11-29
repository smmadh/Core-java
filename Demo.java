package polymorphism;

class test{
	public void display() {
		System.out.println("no arg");
	}
	public void display(int a) {
		System.out.println("1 arg");
	}
	public void display(int a,int b) {
		System.out.println("2 arg");
	}
	public void display(int a,int b,int c) {
		System.out.println("3 arg");
	}
	public void display(int a,float b) {
		System.out.println("Interchanging");
	}
	public void display(float a,int b) {
		System.out.println("Interchanging int to float");
	}
}

public class Demo {

	public static void main(String[] args) {
		test ob=new test();
		ob.display();
		ob.display(12);
		ob.display(2, 2);
		ob.display(10, 5, 10);
		ob.display(12, 5.5f);
		ob.display(10.5f, 5);

	}

}
