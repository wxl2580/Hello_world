package cn.Java_day01_works;

import java.util.Scanner;

public class GongYuanShu01 {
	public static void main(String[] args) {
		
		Scanner in1 = new Scanner(System.in);
		System.out.println("�������һ������");
		int a =in1.nextInt();
		Scanner in2 = new Scanner(System.in);
		System.out.println("������ڶ�������");
		int b =in2.nextInt();
//		int a=24;
//		int b=48;
//		int gys = 0;
		int gongyueshu=G_gus(a,b);
		int gongbeishu=L_gbs(a,b);
		
		System.out.println("���Լ��"+gongyueshu);
		System.out.println("��С������"+gongbeishu);
		
	}
	
	public static int G_gus(int a, int b){
		int gys = 0;
		if(a<b){
			 a = a+b;
			 b = a-b;
			 a = a-b;
		}
		if(a%b==0){
			 gys = b;
		}
		while(a%b>0){
			b = a%b;
			if(a<b){
				 a = a+b;
				 b = a-b;
				 a = a-b;
			}

			if(a%b==0){
				 gys = b;
			}
		}
		return gys;
	}
	
	public static int L_gbs(int a ,int b){
		int l_gbs=(a*b)/G_gus(a,b);
		return l_gbs;
	}
}
