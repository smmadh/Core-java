package polymorphism;
//case1:
class A8{
	public void show(int a) {
		System.out.println("Integer type");
	}
	public void show(float b) {
		System.out.println("float type");
	}
}
public class typematchingcase1 {

	public static void main(String[] args) {
	  A8 ob=new A8();
	  ob.show(10);
	  ob.show(2.5f);
	  ob.show('C');

	}

}
