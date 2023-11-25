package operator;

public class conditionalop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=40;
		int d=75;
		int e=60;
		
		int max;
		max=(a>b && a>c && a>d && a>e)? a:
		    (b>a && b>c && b>d && b>e) ? b:
		    	(c>a && c>b && c>d && c>e)? c:
		    		(d>a && d>b && d>c && d>e) ? d:
		    			(e>a && e>b && e>c && e>d)? e:d;
		     				    	
		System.out.println("max value is:"+max);

	}

}
