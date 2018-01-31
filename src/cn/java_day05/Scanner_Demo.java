package cn.java_day05;

import java.util.Scanner;

public class Scanner_Demo {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a = in.nextInt();
		
		System.out.println("你输入的是："+a);
		
		String s = in.next();
		System.out.println("你输入的是："+s);
		
	}
}
