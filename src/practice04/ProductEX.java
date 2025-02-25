package practice04;

public class ProductEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<String,Integer> galaxy = new Product<>();
		
		galaxy.setModel(25);
		
		Product<String,String> galaxys = new Product<>();
		
		galaxys.setModel("25s");
		
		Product<App,String> product = new Product<>();
		
		App app = new App();
		
		product.setProduct(app);
	}

}
