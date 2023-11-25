package operator;
import java.util.Scanner;
public class register {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user name:");
		String us=sc.next();
		System.out.println("enter the password:");
		String p=sc.next();
		//checking username and password is matching or not
		if(us.equals("Tejas") && p.equalsIgnoreCase("madhu")) {
			System.out.println("succesfull");
		}
		else {
			System.out.println("unsuccesfull");
		}
		

	}

}
