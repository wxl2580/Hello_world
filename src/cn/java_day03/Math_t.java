package cn.java_day03;

public class Math_t implements Teacher {

	@Override
	public void t_say(String name) {
		System.out.println(name+"是数学老师！");
	}

}
