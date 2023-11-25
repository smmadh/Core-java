package constructor;

class A{
	int rollno=123;
	String name="Madhu";
	int price=4000;
	String Cname="Bmw";
	String Cmod="S";
	
	
	A(){
		System.out.println("========student details===============");
	}
	A(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
		
	}
	A(int price,String Cname,String Cmod){
		this.price=price;
		this.Cname=Cname;
		this.Cmod=Cmod;
	}
	//A(){
		//System.out.println("no argument constuctor");
	//}
   //	A(int a,int b){
		//System.out.println("parameterized constructor");
	//}
}
public class Demo {

	public static void main(String[] args) {
		A ob=new A(123,"Madhu");
		A ob1=new A();
		A ob2=new A(4000,"Bmw","s");
		A ob3=new A(400000,"Audi","s");
		
		System.out.println("name is:"+ob.name);
		System.out.println("rollno is:"+ob.rollno);
		System.out.println("=========car details==============");
		System.out.println("car name is:"+ob2.Cname);
		System.out.println("car modle is:"+ob2.Cmod);
		System.out.println("car price is:"+ob2.price);
		System.out.println("==========car deatils2==============");
		System.out.println("car name is:"+ob3.Cname);
		System.out.println("car modle is:"+ob3.Cmod);
		System.out.println("car price is:"+ob3.price);
		

	}

}
