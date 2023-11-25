package Itrativestatment;
import java.util.Scanner;

public class patternsusingscan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row;
		 int i,j,k;
		 System.out.println("Enter the number to print the stars:");
		 row=sc.nextInt();
	        for(i=1;i<=row;i++) {
	      	  for(j=5;j>=i;j--) {
	      		  System.out.print(" ");
	      	  }
	      	  for(k=1;k<=i;k++) {
	      		  System.out.print(" *");
	      	  }
	      	  System.out.println( );
	      	  }
	        
	        for(i=1;i<=row;i++) {
	      	  for(j=0;j<=i;j++) {
	      		  System.out.print(" ");
	      	  }
	      	  for(k=4;k>=i;k--) {
	      		  System.out.print(" *");
	      	  }
	      	  System.out.println( );
	        }
		

	}

}
