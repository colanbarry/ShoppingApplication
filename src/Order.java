import java.util.*;
public class Order {
	Product oItem;
	int amt, oNum;
	static int oCount = 0;
	
	public Order(Product item, int numOr) {
		oCount++;
		this.oItem = item;
		this.amt = numOr;
		this.oNum = oCount;	
	}
	public Product getOrItem() {
		return oItem;
	}
	public void printIDOrd(int ID) {
		if ((this.oItem).getProductID() == ID){
		System.out.println("Order Number: "+oNum + " \nOrder item: " + oItem.getName() + "\namount: " + amt);
		}
	}

	public void print() {
		System.out.println("Order item: " + oItem.getName() + "\namount: " + amt);
	}


}
