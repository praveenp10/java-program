package task1;
import java.util.ArrayList;
import java.util.Scanner;
public class MainUser {
	public static void main(String[]args) {
		Scanner Scanner = new Scanner(System.in);
		Product Product = new Product();
		
	
		while(true) {
			System.out.println("Menu:");
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Exit");
			System.out.println("Select an option");
			int option = Scanner.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Enter the product to add list:");
					Scanner.nextLine();
					String productToAdd = Scanner.nextLine();
					Product.addProductToList(productToAdd);
					System.out.println("product add successfully*");
					break;
				case 2:
					ArrayList<String>productList = Product.getProductList();
					if (Product.isEmpty()) {
						System.out.println("This list is empty now ");
					}else {
						System.out.println("products are in alphabetic order:");
						Product.sortProductList();
						for (String product: Productlist) {
							System.out.println(product);
							}
							}
					break;
				case 3:
					System.out.println("Thank you for using the application ");
					Scanner.close();
					return;
				defalut:
					System.out.println("invalid option please select the valid option(1*3)");
			}
		}
	}}
					
				