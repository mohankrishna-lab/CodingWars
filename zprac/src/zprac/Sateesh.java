package zprac;

import java.util.Scanner;

public class Sateesh {
	
	public static void main(String[] args) {
		float maxRetailPrice;
		int quantity;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter MRP and quantity");
		maxRetailPrice = sc.nextFloat();
		quantity = sc.nextInt();
		float discountPercentage;
		if (quantity <= 100) {
			discountPercentage = 15.0f;
		}else if(quantity <= 200) {
			discountPercentage = 20.0f;
		}else {
			discountPercentage = 23.0f;
		}
		
		float unitPrice = maxRetailPrice - maxRetailPrice * discountPercentage/100;
		System.out.println("the purchase "+unitPrice);
		sc.close();
	}
}
