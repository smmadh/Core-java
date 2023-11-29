package polymorphism;
class A{
	String s="sudhan";
	public void display() {
		System.out.println("madhu"+s);
	}
	public void display(int a,int b) {
		System.out.println("add"+(a+b));
	}
}

public class operatoroverlod {

	public static void main(String[] args) {
		A ob =new A();
		ob.display();
		ob.display(10, 15);

	}

}
