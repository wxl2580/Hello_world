package cn.java_day05;

import java.util.Scanner;

public class Scanner_Demo {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		System.out.println("������һ��������");
		int a = in.nextInt();
		
		System.out.println("��������ǣ�"+a);
		
		String s = in.next();
		System.out.println("��������ǣ�"+s);
		
	}
}
