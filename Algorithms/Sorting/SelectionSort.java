package Sorting;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				int temp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=temp;
			}
		}
	}
	public static void main(String args[]) {
		int arr[]= {10,45,34,23,67,89,34,56,12,8};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
}
