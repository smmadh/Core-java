package polymorphism;

class B{
	public void display(Object o){
		System.out.println("root method");
	}
	public void display(String s) {
		System.out.println("child method");
	}
}
public class case2 {

	public static void main(String[] args) {
		B ob =new B();
		ob.display(new Object());
		ob.display("madhu");
		ob.display(null);

	}

}
