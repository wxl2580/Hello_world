package cn.Java_day01_works;

import java.util.Scanner;

public class Reversed_order {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);

		while(true){
	    System.out.println("请输入一个4位数");      
	    int  s1=in.nextInt();  
		int num = s1;
		int q = num/1000;
		int b = (num%1000)/100;
		int s = (num%100)/10;
		int g = num%10;
		int num_new =g*1000+s*100+b*10+q;
		System.out.println("原数："+num+"\n"+"新数："+num_new);
		}
	}
}
