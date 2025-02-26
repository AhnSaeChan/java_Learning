package ch08second;

import java.util.HashSet;
import java.util.Set;

public class HashSetEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> computerLangs = new HashSet<>();
		
		// 출력문 : 향상된 for 문
		
		computerLangs.add("HTML");
		computerLangs.add("BootStrap");
		computerLangs.add("CSS");
		computerLangs.add("CSS");
		computerLangs.add("CSS");
		computerLangs.add("Javascript");
		computerLangs.add("JAVA");
		computerLangs.add("JAVA");
		
		for(String computerLang : computerLangs) {
			System.out.println("computerLang:" + computerLang);
		}
		
	}

}
