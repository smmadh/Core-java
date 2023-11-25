package Itrativestatment;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		System.out.println("patterns of stars");
		
		for(i=1;i<=4;i++){
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		System.out.println("Reverse patterns of stars");
		for(i=1;i<=4;i++){
			for(j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println( );
		}

	}

}
