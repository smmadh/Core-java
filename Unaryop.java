package operator;
import java.util.Scanner;

public class Unaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("=======post inceremnet================");
		System.out.println("enter the post inc value:");
		int a=sc.nextInt();
		int b=a++;
		System.out.println(b);
		System.out.println(a);
		
		System.out.println("=========post dec===========");
		System.out.println("enter the post dec value:");
		int c=sc.nextInt();
		int d=c--;
		System.out.println(d);
		System.out.println(c);
		
		System.out.println("======pre dec=================");
		System.out.println("enter the pre inc value:");
		int e=sc.nextInt();
		int f=--e;
		System.out.println(f);
		System.out.println(e);
		
		System.out.println("=======pre ince==========");
		System.out.println("enter the pre dec value:");
		int g=sc.nextInt();
		int h=++g;
		System.out.println(g);
		System.out.println(h);
		




	}

}
