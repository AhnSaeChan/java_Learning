package practice04;

import java.awt.Toolkit;

public class TryCatchFinal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	
	for(int i = 0; i < 5 ; i ++) {
		toolkit.beep();
		Thread.sleep(500);
	}
	}

}
