package polymorphism;
class C{
	public void display(StringBuffer s) {
		System.out.println("child 1");
	}
	public void display(String a) {
		System.out.println("child 2");
	}
}
public class case3 {

	public static void main(String[] args) {
       C ob=new C();
       ob.display(new StringBuffer());
       ob.display("tej");
      
       
       
	}

}
