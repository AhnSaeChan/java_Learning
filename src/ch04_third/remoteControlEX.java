package ch04_third;

import ch04_first.RemoteControl;

public class remoteControlEX {
	public static void main (String[] args) {
		
		Television television = new Television();
		television.turnOn();
		
		Setupbox setupbox = new Setupbox();
		setupbox.turnOn();
		
		RemoteControl remoteControl = new Setupbox();
		remoteControl.turnOn();
			
		
	}
}
