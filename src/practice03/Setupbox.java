package practice03;

public class Setupbox implements ProductManager {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("섯업박스를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("섯업박스를 끕니다");
		
	}

	@Override
	public void functionOn() {
		// TODO Auto-generated method stub
		System.out.println("넷플릭스를 켭니다");
	}

	@Override
	public void functionOff() {
		// TODO Auto-generated method stub
		System.out.println("넷플릭스를 끕니다");
		
	}
	

}
