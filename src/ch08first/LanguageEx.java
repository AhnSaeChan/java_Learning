package ch08first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> friends = new ArrayList<>();
		
		System.out.println("friends.size():" + friends.size());
	
		friends.add("Tony");
		friends.add("Tiffany");
		friends.add("Jeniffer");
		friends.add("John");
		friends.add("Tom");
		friends.add("Andrew");
		friends.add("Tiger");
		friends.add("Selly");
		
		System.out.println("friends.size():" + friends.size());
		System.out.println("================================");
		
		// 기존 for 문 (정해진 반복자만큼 반복한다)
		for(int i = 0; i < friends.size(); i ++) {
			System.out.println("friends.get(i):" + friends.get(i));
		}
		
		System.out.println("===============================");
		
		
		// 향상된 for 문 (남겨진 데이터만큼 자동으로 돌아진다)
		for(String friend: friends) {
			System.out.println("friend :" + friend);
		}
		
		for(String friend: friends) {
			System.out.println("friend :" + friend);
		}
		
		
//		test.remove(0);
//		test.remove(1);
//		test.remove(2);
//		test.remove(3);
//		
//		
//		System.out.println("test.size():" + test.size());
	}

}
