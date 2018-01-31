package cn.java_day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Demo {

	public static void main(String[] args) {
		
		Map mp = new HashMap();
		
		mp.put(0, "–¶–¶");
		mp.put(1, 5);
		mp.put(100, 100);
		mp.put(3, true);
		mp.put(2, ' ¿');
		mp.put(5,"sss");
		
		
		Set set_key = mp.keySet();
		
		for(Object mp_index:set_key){
			System.out.print(mp_index+",");
			System.out.println(mp.get(mp_index));
		}
			
		System.out.println(mp.values());
		
		System.out.println();
		System.out.println(mp.size());
		
		System.out.println(mp.get(0));
		
		mp.remove(0);
		mp.remove(1,5);
		
		System.out.println(mp.size());
		
		
		
		
	}
}
