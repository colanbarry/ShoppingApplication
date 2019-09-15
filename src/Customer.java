import java.util.*;
public class Customer {

	String cname, address;
	static ArrayList<Order> orders = new ArrayList<Order>();
	static ArrayList<Customer> customers  = new ArrayList<Customer>();
	public Customer(String cname, String address) {
		this.cname = cname;
		this.address = address;
	}
	public String getName() {
		return cname;
	}
	public void setName(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return(cname + " " + address);
	}



}
