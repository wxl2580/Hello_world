package cn.Java_day01;

public class Selection_sort {
	public static void main(String[] args) {
		int arr[] = {8,4,2,7,9,5,1,6,3};
		for(int i = 0 ; i < arr.length-1; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
			for(int p: arr){
				System.out.print(p+",");
			}
			System.out.println();
		}
	}
}
