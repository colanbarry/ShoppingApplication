import java.util.*;

public class Test {

	public static void main(String[] args) {
		char choice;
		int custNo = 0;
		int orIDNum = 0;
		int numItemsOr = 0;
		int prodID = 0;
		Scanner sc = new Scanner(System.in);
		Phone p1 = new Phone("iPhoneX", "Smart phone", 699, "Apple","iPhoneX", "64gb");
		Phone p2 = new Phone("iPhoneS", "Smart phone", 350, "Apple","iPhoneS", "32gb");
		TV t1 = new TV("TV", "Smart TV", 960, "Samsung", "OLED", 65, true);
		TV t2 = new TV("TV", "Smart TV", 750, "Samsung", "OLED", 45, true);
		Customer John = new Customer("John", "Blackpool");
		//System.out.println(p1.toString());
		//System.out.println(p2.toString());
		ProductDB.prodList.add(p1);
		ProductDB.prodList.add(p2);
		ProductDB.prodList.add(t1);
		ProductDB.prodList.add(t2);
		
		do {
			
			System.out.print("\n\t\tPlease select an option\n\n 1. Create a new phone\t\t 2. Create a new customer\n\n 3. Search by product ID\t 4. Display all products\n\n "
					+ "5. Create order\t\t 6. Display all orders\n\n 7. Orders by product ID\t 8. Quit\n");
			choice = sc.next().charAt(0);

			if (choice == '1'){
				System.out.println("Enter the phone make");
				String pmake = sc.next();

				System.out.println("Enter the model");
				String pmodel = sc.next();

				System.out.println("Enter the phone storage");//in format of string i.e. 32gb
				String pstorage = sc.next();

				System.out.println("Enter the phone name");
				String pname = sc.next();

				System.out.println("Enter a description");
				String pdescription = sc.next();

				System.out.println("Enter the phone price");
				int pprice = sc.nextInt();

				Phone newPhone = new Phone(pmake, pmodel, pprice, pname, pdescription, pstorage);
				ProductDB.prodList.add(newPhone);

			}else if (choice == '2') {
				System.out.println("\nPlease enter your customer name:");
				String name = sc.next();
				System.out.println("Please enter the customer address:");
				String address = sc.next();

				Customer newCust = new Customer(name, address);
				Customer.customers.add(newCust);
			
			}else if (choice == '3') {
				System.out.println("Enter ID");
				Product.count = sc.nextInt();
				System.out.println(ProductDB.findProdByid(ProductDB.prodList, Product.count));


			
			}else if (choice == '4') {
				for (Product prod : ProductDB.prodList){
					System.out.println(prod);
				}
			
			}else if (choice == '5') {
					System.out.println("Please pick a number for the desired user.\n");
					for (int i = 0; i < Customer.customers.size(); i++) {
						System.out.println(i + ". " + Customer.customers.get(i));
					
					custNo = sc.nextInt();
					}
					System.out.println("Enter the product ID of the product you'd like to order.");
					orIDNum = sc.nextInt();
					
					Product pp = new Product(null, null, orIDNum);
					pp = ProductDB.findProdByid(ProductDB.prodList, orIDNum);
					System.out.println("\nPlease enter the quantity of items you'd like to order: ");
					numItemsOr = sc.nextInt();
					Order o1 = new Order(pp, numItemsOr);
					Customer.orders.add(o1);
				
			}else if (choice == '6') {
					for (Order custOr : Customer.orders){
						custOr.print();
					}
			
			}else if (choice == '7') {
					System.out.println("\nEnter the id of the product.\n");
					prodID = sc.nextInt();
					for (Order or : Customer.orders) {
						int i = 0;
						if (or.getOrItem().getProductID() == prodID) {
							Customer.orders.get(i).printIDOrd(prodID);
							i++;
							
					}
				}
			
				}else if (choice == '8') {
					System.out.println("\n\t\t\tGood bye!");
					System.exit(8);
				}
		}while (choice !=8);
		sc.close();
		//System.out.println(John);
		/*System.out.println("Enter ID");
		Product.count = sc.nextInt();
		System.out.println(ProductDB.findProdByid(ProductDB.prodList, Product.count));

		 */
	}

}
