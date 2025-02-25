package ch07first;

import java.awt.Toolkit;

public class TryCatchFinalEX {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//public void abc() throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i ++) {
			toolkit.beep();
			Thread.sleep(500);
		
		}
	}
	
	//public void xyz() throws InterruptedException {
			//abc();
	//}
}
//}


