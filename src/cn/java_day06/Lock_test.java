package cn.java_day06;

public class Lock_test {
	public static void main(String[] args) {
		Runnable p = new Piao();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		
//		t1.start();
//		t2.start();
		
		Runnable p2 = new Piao02();
		Thread t3 =  new Thread(p2);
		Thread t4 = new Thread(p2);
		t3.setName("Ğ¡Ó°");
		t4.setName("Ï²ÔÃ");
		t3.start();
		t4.start();
	}
}
