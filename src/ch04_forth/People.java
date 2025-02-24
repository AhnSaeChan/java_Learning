package ch04_forth;

public class People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		Admin admin = new Admin();
		
		user.showMyName();
		admin.showMyName();
		
		Member member = new User();
		member.showMyName();
		member.showMyName();
		member.showMyName();
		member.showMyName();
		
		
		
	}

}
