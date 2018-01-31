package cn.Java_day01_works;

import java.util.Scanner;

public class GongYueShu02 {
	 public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		System.out.println("请输入第一数");
		int num1 =in1.nextInt();
		System.out.println("请输入第二数");
		Scanner in2 = new Scanner(System.in);
		int num2 =in2.nextInt();
		
		/*	取小的数(最大公约数两个小的数找器)
		if(i>j){
			k = j;
		}else{
			k = i;
		}*/
		//求最大公约数
		int m=num1;
		int n=num2;
		
		int k= m>n?n:m;
		for(int i=k; i>0 ;i--){
			if(m%i==0&&n%i==0){
				System.out.println("最大公约数为："+i);
				break;
			}
		} 

		int a=num1;
		int b=num2;
		int k2 = b>a?b:a;
		int m2 = k2;
		while(k2<=(a*b)){
			if(k2%a==0&&k2%b==0){
				System.out.println("最小公倍数是："+k2);
				break;
			}
			k2+=m2;
		}
	}
}
