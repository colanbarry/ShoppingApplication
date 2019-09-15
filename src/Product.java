import java.util.*;
public class Product {
	String name, description;
	int price;
	int productID;
	static int count = 0;
	


	public Product(String name, String description, int price)
	{
		this.name = name;
		this.description = description;
		this.price = price;
		setProductID(++count);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public  int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}
	public void print(){
		System.out.println("Name: " + name + " Description: " + description + " Price: " + price + " Product ID: " + productID);
	}
}
