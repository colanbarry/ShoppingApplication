
public class Phone extends Product{
	static String make;
	static String model;
	static String storage;

	public Phone(String name, String description, int price, String make, String model, String storage)
	{
		super(name, description, price);
		this.make = make;
		this.model = model;
		this.storage = storage;

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	public void print(){
		super.print();
		System.out.println("Make: "+ make + " Model: " + model + " Storage: " + storage);
	}
	public String toString() {
		print();
		return "";
	}

}
