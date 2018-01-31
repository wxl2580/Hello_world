package cn.java_day04;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(8);
		set.add("wxl");
		set.add(true);
		set.add('Ïþ');
		
		System.out.println(set.size());
		set.remove(8);
//		System.out.println(set.removeAll(set));
		
		System.out.println(set.size());
		System.out.println(set.contains(8));
		
		for(Object s: set){
			System.out.print(s+" ");
		}
	}
}

