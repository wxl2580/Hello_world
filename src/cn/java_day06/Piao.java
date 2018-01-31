package cn.java_day06;

public class Piao implements Runnable{
	int count = 20 ;
	Object lock = new Object();
	@Override
	public void run() {	
		while(count>0){
			synchronized(lock){	
				if(count>0){
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
				System.out.println(Thread.currentThread().getName()+"售出第"+count+"张票");
					
			count--;
				}
			}	
		}
	}
}
