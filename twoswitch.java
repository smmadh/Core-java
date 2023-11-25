package selectionstatments;

public class twoswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
	final int y=20;
		
			
			switch(x) {
			case 10:
				System.out.println("hello");
				
			case y:
				System.out.println("hi");
			}
		////////////////////////////////////////////////
		System.out.println("================================");
		switch(y) {
		case 10:
			System.out.println("hello");
			break;
			
		case y:
			System.out.println("hi");
		}

	}

}
