package Sorting;

public class QuickSort {
	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int partitionIndex=partition(arr,low,high);
			quickSort(arr,low,partitionIndex-1);
			quickSort(arr,partitionIndex+1,high);
		}
	}
	public static int partition(int arr[], int low, int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<=high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
	}
	public static void main(String args[]) {
		int arr[]= {10,6,4,34,67,89,23,1,45};
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
}
