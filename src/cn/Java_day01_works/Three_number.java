package cn.Java_day01_works;

public class Three_number {
	public static void main(String[] args) {
		int[] arr ={4,3,2,1};
int count=0;
		for(int i=0;i<arr.length ; i++){
			int a = arr[i];
				for(int j =0; j <arr.length; j++){
					if(i!= j){
				int	 b = arr[j];
					for(int k = 0; k<arr.length;k++){
						if(k!=i&&k!=j){
						int	 c = arr[k];
						int m = a*100+b*10+c;
						System.out.println(m);
						count++;
						}
					}
				}
			}
				System.out.println(count);
				
		}
	}
}
