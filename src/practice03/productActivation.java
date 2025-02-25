package practice03;

public class productActivation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		
		Television tv2 = new Television();
		tv2.functionOn();
		tv2.functionOff();
		tv2.stayedTuned();
		
		Radio rd = new Radio();
		rd.turnOn();
		rd.turnOff();
		
		Radio rd2 = new Radio();
		rd2.functionOn();
		rd2.functionOff();
		
		Setupbox sb = new Setupbox();
		sb.turnOn();
		sb.turnOff();
		
		Setupbox sb2 = new Setupbox();
		sb2.functionOn();
		sb2.functionOff();
		
		ProductManager pd = new Television();
		pd.functionOn();
	}

}
