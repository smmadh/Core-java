package variables;

class Staticdemo{
	static int a=200;
	static String details="==============";
	static String name="madhu";
	static int age=21;
	static String emailid="smmadhu091@gmail.com";
	static String phno="8861781869";
	static {
		System.out.println("student details");
	}
}

public class Static {
	static int a=100;
	static String details="=====================";
	static String name="madhu";
	static int age=21;
	static String emailid="smmadhu091@gmail.com";
	static String phno="8861781869";
	
	
	

	public static void main(String[] args) {
	
		System.out.println(a);
		System.out.println(details);
		System.out.println(name);
		System.out.println(age);
		System.out.println(emailid);
		System.out.println(phno);
		System.out.println(Staticdemo.details);
		System.out.println(Staticdemo.name);
		System.out.println(Staticdemo.age);
		System.out.println(Staticdemo.a);
		System.out.println(Staticdemo.emailid);
		System.out.println(Staticdemo.phno);
		

	}

]}


