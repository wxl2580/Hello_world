package cn.java_day05;

public class Thread02 extends Thread{
	@Override
	public void run(){
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 10 ; i++){
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"Ð¡Ó°ºÈË®£¡");
			
		}
	}
}
