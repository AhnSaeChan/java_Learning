package practice03;

public class Television implements ProductManager {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원이 켜졌습니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원이 꺼졌습니다");

	}

	@Override
	public void functionOn() {
		// TODO Auto-generated method stub
		System.out.println("채널을 선택합니다");
	}

	@Override
	public void functionOff() {
		// TODO Auto-generated method stub
		System.out.println("채널을 바꿉니다");
		
	}
	public void stayedTuned() {
		System.out.println("채널을 고정합니다");
	}

}
