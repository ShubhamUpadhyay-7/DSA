package Searching;

public class Linear_Search {
	
	public static int linearSearch(int arr[],int length,int x) {
		for(int i=0;i<length;i++) {
			if(arr[i]==x) {
				return i+1;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int array[]= {5,10,21,5,2,80,3,56};
		System.out.println(linearSearch(array,array.length,3));
	}
}
