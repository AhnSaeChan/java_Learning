package ch08third;

import java.util.HashMap;
import java.util.Map;

public class HashMapEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> friends = new HashMap();
		
		friends.put("장원영키" , 170);
		friends.put("전지현키" , 171);
		friends.put("장동건키" , 172);
		friends.put("고소영키" , 173);
		friends.put("최은경키" , 174);
		
		for(String strKey: friends.keySet()) {
			Integer StrValue = friends.get(strKey);
			System.out.println(strKey + ": strValue; " + StrValue);
		}
	}

}
