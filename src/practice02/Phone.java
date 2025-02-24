package practice02;

public abstract class Phone {
	
	String turnOn;
	String turnOff;
	String model;
	String color;
	
	
	Phone(){
	}
	public Phone(String turnOn, String turnOff, String model, String color ) {
		this.turnOn=turnOn;
		this.turnOff=turnOff;
		this.model=model;
		this.color=color;
	}
	void type(String turnOn, String turnOff) {
		System.out.println(turnOn + turnOff);
	}
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	public abstract void open();
	
	
}
