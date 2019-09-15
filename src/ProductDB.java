import java.util.*;
public class ProductDB {
	
	static ArrayList<Product> prodList = new ArrayList<Product>();	

	static Product findProdByid(List<Product> prodList,int productID)
	{
		Product prod = null;
		for(Product pro : prodList){
			if (pro.productID == productID){
				prod = pro;
			}
			
		}
		return prod;
	}
	public void add(Product i) {
		this.prodList.add(i);
	}


}
