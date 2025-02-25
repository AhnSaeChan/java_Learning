package practice03;

public class Radio implements ProductManager {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("라디오를 켭니다");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("라디오를 끕니다");
		
	}

	@Override
	public void functionOn() {
		// TODO Auto-generated method stub
		System.out.println("음악을 켭니다");
	}

	@Override
	public void functionOff() {
		// TODO Auto-generated method stub
		System.out.println("음악을 끕니다");
		
	}
	

}
