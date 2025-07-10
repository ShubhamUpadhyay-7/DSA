package Sorting;

public class InsertionSort {
	public static void insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	public static void main(String args[]) {
		int arr[]= {10,76,45,3,65,33,2,8,0};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
}
