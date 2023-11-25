package Itrativestatment;
import java.util.Scanner;
public class dowhile {

	public static void main(String[] args) {
		int num;
		// TODO Auto-generated method stub
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a num:");
			 num=sc.nextInt();
			 if(num!=0)
			 {System.out.println("positive");}
				 
		}while(num<=0);
		
     
	}

}
