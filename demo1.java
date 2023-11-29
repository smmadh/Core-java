package polymorphism;

class test3{
	test3(){
		System.out.println("no arg");
	}
	test3(String name){
		System.out.println("one arg");
	}
	test3(String name,int quantity){
		System.out.println("two arg");
	}
	test3(String name,int quantity,String size){
		System.out.println("3 arg");
	}
	test3(String name,int quantity,String size,String Color){
		System.out.println("4 arg");
	}
	
}
public class demo1 {

	public static void main(String[] args) {
		test3 ob=new test3();
		test3 ob1=new test3("book");
		test3 ob2=new test3("book",2);
		test3 ob3=new test3("book",2,"small");
		test3 ob4=new test3("book",2,"small","black");
	
	}

}
