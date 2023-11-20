package operator;
import java.util.Scanner;

public class Bitwiseop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Bitwise op");
		int a=sc.nextInt();
		int b=sc.nextInt();
;		int c=a|b;
     	int d=a&b;
     	int e=a^b;
     	int g=~b;
		System.out.println("A | B is:"+c);
		System.out.println("A & B is:"+d);
     	System.out.println("A ^ B is:"+e);
     	System.out.println("A ~ B is :"+g);
		

	}

}
