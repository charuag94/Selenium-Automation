package automation;

import java.util.HashMap;
import java.util.Map;

public class HashMapFindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] ch = str.toCharArray();

		for (char c : ch) {
			
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			
			else {
				map.put(c, 1);
			}

		}
		
		System.out.println(map);
	}

}
