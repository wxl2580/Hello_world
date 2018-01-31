package cn.Java_day01_works;

public class ShuXianHua {
	public static void main(String[] args) {
		System.out.print("100~1000是水仙花数的是：");
		for (int i = 100 ; i <= 999; i++){
			int b = i/100;
			int s = (i%100)/10;
			int g = i%10;
			if((Math.pow(b,3)+Math.pow(s,3)+Math.pow(g,3))==i){
				System	.out.print(i+" ");
			}
		}
	}
}
