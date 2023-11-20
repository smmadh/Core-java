package operator;
import java.util.Scanner;

public class shoppingcart {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		 System.out.print("Enter the quantity of the item: ");
	        int quantity = sc.nextInt();

	        System.out.print("Enter the price of the item: ");
	        double price = sc.nextDouble();

	        // Calculate the total cost before tax
	        double totalBeforeTax = quantity * price;

	        // Assume a 10% discount on the total cost
	        double discount = 0.10 * totalBeforeTax;
	        double discountedTotal = totalBeforeTax - discount;

	        // Assume a 7% tax on the discounted total
	        double taxRate = 0.07;
	        double tax = taxRate * discountedTotal;

	        // Calculate the final total cost
	        double finalTotal = discountedTotal + tax;

	        // Display the results
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Price per item: $" + price);
	        System.out.println("Total cost before discount: $" + totalBeforeTax);
	        System.out.println("Discount: $" + discount);
	        System.out.println("Discounted total: $" + discountedTotal);
	        System.out.println("Tax: $" + tax);
	        System.out.println("Final total: $" + finalTotal);

	        // Close the scanner
	        sc.close();
	    }
	

	
	

	}

