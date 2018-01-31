package cn.Java_day01;
/**
 * 
 * @author xizoling
 *
 */
public class Bubble_Sort {
	public static void main(String[] args) {

	int arr[] = {8,4,2,7,9,5,1,6,3};
		for(int i = 0 ; i < arr.length-1 ; i++){
			for(int j = 0; j < arr.length-1-i; j++){
				if(arr[j]<arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
			for(int p: arr){
				System.out.print(p+",");
			}
			System.out.println();
		}
		System.out.println("********************");
		for(int p: arr){
			System.out.print(p+" ");
		}
	}
}
