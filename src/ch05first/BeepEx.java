package ch05first;

import java.awt.Toolkit;


public class BeepEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//way1
//		Runnable runnable = new BeepPrintRunnable();
//		Thread thread = new Thread(runnable);
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i < 5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch(Exception e) {}
				}
				for(int i = 0; i < 5; i++) {
					System.out.println("7");
					try {Thread.sleep(500);}catch(Exception e) {}
				}
			}
		});
		
		thread.start();
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// ctrl + shift + o
		for(int i=0; i < 5; i++) {
		toolkit.beep();
		try {
			Thread.sleep(500);
		}catch (InterruptedException e) {}
			
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("12");
			try{Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
