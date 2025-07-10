package arrays;

public class aBasic {

	public static void main(String[] args) {
		//a)Initialization
		
		
		//1)
		int[] arr1= {1,6,7,9};
		
		//2)
		int[] arr2=new int[5];
		

		//b)Getting a value
		
		System.out.println(arr1[3]);
		
		
		//c)Setting a value
		
		arr2[3]=8;
		arr1[0]=0;
		
		//d)length-property in array not method
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
	}

}
