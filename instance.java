package variables;

public class instance {
	int a;//a
	float b;//0.0
	String name="madhu";//null
	String departemnet="bca";
	int age=21;
	String address="banglore";
	String emailid="smmadhu091@gmail.com";
	String phno="8861781869";
	float sal;
	double d;
	byte e;
	char f;
	boolean g;

	public static void main(String[] args) {
	
instance ob=new instance();
System.out.println(ob.a);
System.out.println(ob.b);
System.out.println("Name:"+ob.name+" "+"Department:"+ob.departemnet+" "+"Age:"+ob.age+" "+"salary:"+ob.sal+" "+"Address:"+ob.address+" "+"Email-id:"+ob.emailid+" "+"PHNO:"+ob.phno);
System.out.println(ob.d);
System.out.println(ob.e);
System.out.println(ob.f);
System.out.println(ob.g);


	}

}
