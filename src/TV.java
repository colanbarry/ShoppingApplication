import java.util.*;
public class TV extends Product{

	String make, type;
	int screenSize;
	boolean threeD;

	public TV(String name, String description, int price, String make, String type, int screenSize, boolean threeD) {
		super(name, description, price);
		this.make = make;
		this.type = type;
		this.screenSize = screenSize;
		this.threeD = threeD;



	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public boolean isThreeD() {
		return threeD;
	}
	public void setThreeD(boolean threeD) {
		this.threeD = threeD;
	}

	public void print(){
		super.print();
		System.out.println("Make: "+ make + " Type: " + type + " 3D: " + threeD);
	}
	public String toString() {
		print();
		return "";
	}

}
