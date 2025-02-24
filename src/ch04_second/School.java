package ch04_second;

public interface School {
	public static final String GO_TO_SCHOOL = "등교";
	public static final String GO_TO_HOME = "귀가";
	
	public abstract void gotoschool();
	public abstract void gotohome();	
	void goschool(String GO_TO_SCHOOl);
	void gohome(String GO_TO_HOME);
}
