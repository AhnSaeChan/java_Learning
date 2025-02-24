package ch04_first;

public interface RemoteControl {
	
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	final String name = "ansdf";
	
	//추상메서드 :
	public abstract void turnOn();
	void turnOff();
	void SetVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다");
		}else {
			System.out.println("무음해제합니다");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
}
