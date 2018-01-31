package cn.java_day02;

public class ChongZai {
	public static void main(String[] args) {
		add(3);
		add(5.0);
		add(5,3.0);
		add(4.0,9);
		System.out.println(add(3)+"  "+add(5.0)+"  "+add(5,2.0)+"  "+add(19.0,9));
		
	}
	
	public static int add(int a){
		return a;
	}
	public static double add(double a){
		return a;
	}
	
	public static double add(int b,double a){
		return a+b;
	}
	
	public static double add(double a,int b){
		return a-b;
	}
}
