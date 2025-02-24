package ch03first;

public class Cellphone {
	
	String model;
	String color;

	Cellphone(){
		
	}
	
	Cellphone(String model, String color){
		this.model = model;
		this.color =color;
	}
	void type (String model, String color) {
		System.out.println("모델명은 " + model + " 이고 " + " 색은 " + color + " 이다");
	}
	
	//메소드
	
	void powerOn() {System.out.println("전원을 켭니다");}
	void powerOFF() {System.out.println("전원을 끕니다");}
	void bell() {System.out.println("벨이 울립니다");}
	void sendVoice(String message) {System.out.println("메세지");}
	void receiveVoice(String message) {System.out.println("메세지를 받다");}
	void hangUp() {System.out.println("전화를 끕니다");}
	void powerOn(int a) {System.out.println("전원을 켭니다.2");}
	
	
}
