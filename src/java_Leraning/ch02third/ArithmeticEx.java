package java_Leraning.ch02third;

public class ArithmeticEx {
	public static void main(String[ ]args) {
		
	int a = 7;
	int b = 8;
	
	System.out.println(a+ "+"+ b+ "="+ (a + b));
	
	int cal = a+b;
	
	System.out.println(a + "+" + b + "=" + cal);
	
//	plus(7,8);
	
	Arithmetic ari = new Arithmetic();
	
	ari.plus(7,8);
	}
	
	
	
//	static void plus(int a, int b) {
//		System.out.println(a + "+" + b + "=" + (a+b));
//	}
	
}
