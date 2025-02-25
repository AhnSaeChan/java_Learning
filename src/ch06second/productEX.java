package ch06second;

public class productEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<String, Integer> iphone6 = new Product<>();
		
		iphone6.setModel(6);
		
		Product<String,String> iphone6s = new Product<>();
		iphone6s.setModel("6s");
		
		Product<Tv,String> product = new Product<>();
		
		Tv tv = new Tv();
		
		product.setProduct(tv);
	}

}
