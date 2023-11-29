package polymorphism;

class D{
	public void display(int a) {
		System.out.println("one arg");
	}
	public void display(int...b ) {
		System.out.println("...arg");
	}
	public void display(float c ) {
		System.out.println("float arg");
	}
}
public class case4 {

	public static void main(String[] args) {
	D ob=new D();
	ob.display(10);
	ob.display(1,2,3,4);
	ob.display(2.5f);


	}

}
