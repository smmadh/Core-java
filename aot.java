package operator;
import java.util.Scanner;
public class aot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height:");
		double h=sc.nextInt();
		System.out.println("enter the bre:");
		double b=sc.nextInt();
		double aot=0.5*b*h;
		System.out.println("area of triangle:"+aot);

	}

}
