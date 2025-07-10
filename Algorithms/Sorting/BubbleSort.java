package Sorting;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			boolean swapped=false;
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(swapped==false) {
				break;
			}
		}
	}
	public static void main(String args[]) {
		int arr[]= {12,5,67,89,23,55,5,78,90};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
