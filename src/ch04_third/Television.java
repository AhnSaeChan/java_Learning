package ch04_third;

import ch04_first.RemoteControl;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다");
	}

	@Override
	public void SetVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println(10);
	}

}
