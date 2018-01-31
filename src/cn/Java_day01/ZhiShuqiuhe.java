package cn.Java_day01;

public class ZhiShuqiuhe {
		public static void main(String[] args) { 
			zhiShu_sum();
		}
		 //求质数的和
		 public static void zhiShu_sum(){
		 int sum = 0;
		 int num = 100;
		 int i,j;
		 for(i=2;i<=num;i++){
			for(j=2;j<=i;j++){
				if(i%j==0&&i!=j){
					break;
				}
				if(j>(i-1)){
					sum=sum+i;
//					System.out.println(i);
				}
			}
		}
		 System.out.println(sum);
	 }
}
