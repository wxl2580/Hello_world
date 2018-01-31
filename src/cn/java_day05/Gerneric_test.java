package cn.java_day05;

import java.util.Scanner;

public class Gerneric_test {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
////		System.out.println("请输入一个名字：");
//		String str = in.nextLine();
//		
//		
		Generic<String> cat = new Generic<String>();
		cat.Cat("报告");
		Generic<Integer> cat1 = new Generic<Integer>();
		cat1.Cat(8);
		
		Generic<Character> sex=new Generic<Character>();
		sex.Cat('男');
		
	}
}
