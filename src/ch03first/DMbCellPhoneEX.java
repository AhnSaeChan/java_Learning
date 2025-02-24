package ch03first;

public class DMbCellPhoneEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cellphone cellphone = new Cellphone();
		
//		cellphone.model = "SAMSUNG";
//		cellphone.color = "BLACK";
//		System.out.println(cellphone.model);
//		
//		Cellphone cellphone1 = new Cellphone();
//		cellphone1.model = "iphone";
//		cellphone1.color = "16";
//		System.out.println(cellphone1.model);
//		
		DmbCellPhone dmbcellphone = new DmbCellPhone();
		dmbcellphone.model = "SAMSUNG2";
		dmbcellphone.color = "Black";
		System.out.println(dmbcellphone.model);
	    dmbcellphone.powerOn();
	    dmbcellphone.powerOFF();
		
		Cellphone cellphone2 = new Cellphone("iphone 16e", "Black");
		System.out.println(cellphone2.model);
		cellphone.type("SAMSUNG","BLACK");
		
//		DmbCellPhone dmbCellPhone 

	}

}
