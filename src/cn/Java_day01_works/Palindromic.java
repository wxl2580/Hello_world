package cn.Java_day01_works;

import java.util.Scanner;

public class Palindromic {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		while(true){
	    System.out.println("请输入一个五位数");  
	    int  s1=in.nextInt();  
		int num = s1;
		int w =num/10000;
		int q =(num%10000)/1000;
		int b =(num%1000)/100;
		int s =(num%100)/10;
		int g =num%10;
		if(w==g&&q==s){
			System.out.print(num+"是回文数,");
		}else{
			System.out.print(num+"不是回文数,");
			}
		}
	}
}