/**
 * 
 */
package ch04_third;

import ch04_first.RemoteControl;

/**
 * 
 */
public class Setupbox implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("셋업박스를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("섯업박스를 끕니다");

	}

	@Override
	public void SetVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println(10);
	}

}
