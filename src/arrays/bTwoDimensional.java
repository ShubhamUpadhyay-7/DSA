package arrays;

public class bTwoDimensional {

	public static void main(String[] args) {
		//a)Initialization
		
		//1)
		int[][] arr1= {{1,2},{3,4},{6,7}};
		
		//2)
		int[][] arr2=new int[6][7];
		
		//b)Setting
		
		arr1[1][1]=7;
		arr2[2][3]=3;
		
		//c)Getting
		
		System.out.println(arr1[1][1]);
		System.out.println(arr1[0][1]);
		
		System.out.println(arr2[2][3]);
		System.out.println(arr2[5][4]);
		
		//d)length
		//row-length
		System.out.println(arr1.length);
		
		//column-length
		System.out.println(arr1[0].length);
	}

}
