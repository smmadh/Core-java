package operator;

public class minvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=40;
		int d=25;
		int e=60;
		int min;
		min=(a<b && a<c && a<d && a<e)? a:
		      (b<a && b<c && b<d && b<e)?b:
		    	(c<a && c<b && c<d && c<e)?c:
		    	(d<a && d<c && d<b && d<e)?d:
		    		(e<a && e<c && e<d && e<b)? e:d;
		System.out.println("min value is:"+min);

	}
}
