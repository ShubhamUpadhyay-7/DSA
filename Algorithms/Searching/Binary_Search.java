package Searching;

import java.util.Arrays;

public class Binary_Search {
	public static int binarySearch(int arr[],int x) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(x<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int array[]= {4,28,67,89,45,34,12,4,1};
		Arrays.sort(array);
		System.out.println(binarySearch(array,89));
	}
}
