package cn.java_day05;

public class Thread01 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 10 ; i++){
			
			
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i+"Ð¡Ó°³Ô·¹£¡");
		}
	}
}
