package ch03second;

public class Stuident extends People {
	
	public int studentNo;
	
	public Stuident(String name, String ssn, int studentNo) {
		super(name, ssn);
		
		this.name = name;
		this.ssn = ssn;
		this.studentNo = studentNo;
	}
	
	public Stuident(String name, String ssn) {
		super(name, ssn);
	}
	
	public Stuident() {
		
	}
}
