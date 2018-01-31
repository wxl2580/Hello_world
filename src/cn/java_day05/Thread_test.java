package cn.java_day05;

public class Thread_test {
	public static void main(String[] args) {

			Thread tr1 = new Thread01();
			Thread tr2 = new Thread02();
			
//			Runable_Demo rd = new Runable_Demo();
//			Thread tr3 = new Thread(rd);
		
			tr1.start();
			
			tr2.start();
//			tr3.start();
		System.out.println("你真的是个瓜皮！就知道到吃饭睡觉");
		
	}
}
