package Itrativestatment;

public class spaceingandpatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int i,j,k;
          
          
          for(i=1;i<=3;i++) {
        	  for(j=5;j>=i;j--) {
        		  System.out.print(" ");
        	  }
        	  for(k=1;k<=i;k++) {
        		  System.out.print("*");
        	  }
        	  System.out.println( );
        	  }
          
          for(i=1;i<=4;i++) {
        	  for(j=0;j<=i;j++) {
        		  System.out.print(" ");
        	  }
        	  for(k=4;k>=i;k--) {
        		  System.out.print("*");
        	  }
        	  System.out.println( );
          }
          
          
          }
	}


