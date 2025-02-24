package ch03first;

public class DmbCellPhone extends Cellphone {
	void powerOn() {
		System.out.println("Dmbcellphone.전원을 켭니다");
	}

	@Override
	void powerOFF() {
		// TODO Auto-generated method stub
		System.out.println("DmbCellPhone.전원을 끕니다.");
		super.powerOFF();
	}
	
	
}
