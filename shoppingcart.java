package polymorphism;
class cart{
	public void bill(String itemname) {
		System.out.println("Item name");
	}
	public void bill(String itemname,int quality) {
		System.out.println("Iteamname And Quality");
	}
	public void bill(String itemname,int quality,String size) {
		System.out.println("Iteamname and Quality and Size");
	}
	public void bill(String itemname,int quality,String size,String color) {
		System.out.println("Iteamname and Quality and Size and color");
	}
}

public class shoppingcart {

	public static void main(String[] args) {
		cart ob=new cart();{
			ob.bill("Books");
			ob.bill("Books", 2);
			ob.bill("Books", 2, "SMALL");
			ob.bill("Books", 2, "small", "Black");
		}
		

	}

}
