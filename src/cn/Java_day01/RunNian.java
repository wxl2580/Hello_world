package cn.Java_day01;

public class RunNian {
	public static void main(String[] args) {
			int year = 2004;
		
		if(((year%4==0)&&((year%100)!=0))||year%400==0){
			
			System.out.println("ÈóÄê");
		}else{
			System.out.println("Æ½Äê");
		}
	}
}
