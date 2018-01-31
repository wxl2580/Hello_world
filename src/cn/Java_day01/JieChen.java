package cn.Java_day01;

public class JieChen {
	public static void main(String[] args) {

		int x = 20;

		long sum2 = fun(x);
		long sum3 = fun2(20);
		System.out.println(sum2);
		System.out.println(sum3);

	}

	// µÝ¹éÇó½×³Ë
	public static long fun(int x) {
		if (x == 0 || x == 1) {
			return 1;
		}
		return x * fun(x - 1);
	}
	
	//forÑ­»·Çó½×³Ë
	public static long fun2(int x){
		long sum=1;
		for( int i=1 ;i<=x;i++){
			sum=sum*i;
		}
		return sum;
	}
	
}
