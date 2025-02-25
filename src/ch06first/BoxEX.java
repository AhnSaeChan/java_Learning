package ch06first;

public class BoxEX {
	
	public static void main(String[] args) {
//		Box box = new Box();
//		
//		box.a=1;
//		System.out.println(box.a);
		
		Box<Integer> box = new Box<>();
		// box<integer> box = new Box<Integer>(); <- 같은 타입
		box.setT(1);
		System.out.println(box.getT());
		
		//Box<int> box2 = new Box<>() error 원시데이터는 쓸수 없다
		Box<String>box3 = new Box<>();
		box3.setT("TONY");
		System.out.println(box3.getT());
	}
}
