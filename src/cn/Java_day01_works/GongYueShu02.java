package cn.Java_day01_works;

import java.util.Scanner;

public class GongYueShu02 {
	 public static void main(String[] args) {
		Scanner in1 = new Scanner(System.in);
		System.out.println("�������һ��");
		int num1 =in1.nextInt();
		System.out.println("������ڶ���");
		Scanner in2 = new Scanner(System.in);
		int num2 =in2.nextInt();
		
		/*	ȡС����(���Լ������С��������)
		if(i>j){
			k = j;
		}else{
			k = i;
		}*/
		//�����Լ��
		int m=num1;
		int n=num2;
		
		int k= m>n?n:m;
		for(int i=k; i>0 ;i--){
			if(m%i==0&&n%i==0){
				System.out.println("���Լ��Ϊ��"+i);
				break;
			}
		} 

		int a=num1;
		int b=num2;
		int k2 = b>a?b:a;
		int m2 = k2;
		while(k2<=(a*b)){
			if(k2%a==0&&k2%b==0){
				System.out.println("��С�������ǣ�"+k2);
				break;
			}
			k2+=m2;
		}
	}
}
