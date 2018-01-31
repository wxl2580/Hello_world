package cn.Java_day01;

public class Change_num {
	public static void main(String[] args) {
		Jh1();
		Jh2();
	}
	//方法一
	public static void Jh1(){
		int a = 4;
		int b = 6;
		System.out.println("a="+a+" "+"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+" "+"b="+b);
		System.out.println("**************************************");
		System.out.println(3^5);
		
	}
	//方法二
	public static void Jh2(){
		int a = 1;
		int b = 5;
	
		System.out.println("a="+a+" "+"b="+b);
		a=a^b;
		b=a^b;
		a=b^a;
		System.out.println("a="+a+" "+"b="+b);	
	}
}
