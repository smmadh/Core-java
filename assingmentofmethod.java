package accessmodifer;
import java.util.Scanner;
public class assingmentofmethod {
	
	public void evenodd(int n) {
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("nter a number:");
		n=sc.nextInt();
		assingmentofmethod ob=new assingmentofmethod();
		ob.evenodd(n);
    	
	}

}
