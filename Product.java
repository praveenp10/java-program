import java.util.ArrayList;
import java.util.Collections;
public class Product {
	private ArrayList<String>productList;
	
	
	public Product() {
		this.productList = new ArrayList<>();
	}
	
	
	public ArrayList<String> getProductList(){
		 return productList;
	}
	
	
	public void setProductList(ArrayList<String> productList) {
		this.productList= productList;
	}
	
	
	public void addProductToList(String product) {
		productList.add(product);	
		}
	
	public void sortProductList() {
		Collections.sort(productList);
	}
}
