package practice02;

public class Phonedel extends Phone {

	
	void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("전원을 켭니다");
		
	}

//	@Override
//	void powerOff() {
//		// TODO Auto-generated method stub
//		System.out.println("전원을 끕니다");
//		super.powerOff();
//	}
	@Override
	public void open() {
		System.out.println("abstract.open");
	}
	
	
}
