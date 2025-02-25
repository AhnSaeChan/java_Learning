package practice04;

public class Product <P,M> {
	private P Product;
	private M Model;
	
	public P getProduct(){
		return Product;
	}
	public void setProduct(P product) {
		Product = product;
	}
	public M getModel() {
		return Model;
	}
	public void setModel(M model) {
		this.Model = model;
	}
}
