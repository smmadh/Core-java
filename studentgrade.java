package selectionstatments;
import java.util.Scanner;

public class studentgrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("enter the percentage:");
		int p=sc.nextInt();
		if(p>=90) {
			System.out.println("first class");
		}
		else if(p>=60) {
			System.out.println("second clas");
		}
		else if(p>=45) {
			System.out.println("third class");
		}
		else if(p>=35) {
			System.out.println("just pass");
		}
		else if(p<35) {
			System.out.println("fail");
		}
		

	}

}
