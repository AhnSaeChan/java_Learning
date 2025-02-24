package java_Learning.pr;

public class Sum {
	int a;
	int b;
	
	Sum(){
		
	}
	
	Sum (int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void plus (int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}
}
