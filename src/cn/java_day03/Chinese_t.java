package cn.java_day03;

public class Chinese_t implements Teacher {
	
	@Override
	public void t_say(String name) {
		System.out.println(name+"是语文老师!");
	}

}
