package cn.java_day05;

public class Runable_Demo implements Runnable{
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(int i = 0 ;i <= 10 ;i++){
			
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(i+"Ð¡Ó°Ï²»¶Ñ§Ï°£¡");
		}
	}
}
