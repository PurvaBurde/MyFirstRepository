package array;

public class MultiDimensional {
	
	//Single Dimensional Array
	public static int[] arr;
	
	//2-D Array
	public static int[] [] arr1;
	
	//3-D Array
	public static int[][][] arr2;
	
	//4-D Array
	public static int[][][]  []arr3;

	public static void main(String[] args) {
		//arr1=new int[2];  //if your array is 2-D you need to provide size for both
		arr1=new int[2][2];
		
		/*arr1[0][0]=5;
		arr1[0][1]=15;
		arr1[1][0]=25;
		arr1[1][1]=35;*/
		//arr1[1][2]=45;  //......ArrayIndexOutOfBoundsException
		int arr1 [][]= {{5,15},{25,35}};
		
		/*for(int i=0;i<2;i++) {  //..............Approach 1/hardcode to print 2D array
			System.out.println(arr1[i][0]);
			System.out.println(arr1[i][1]);
		}*/
		for(int i=0;i<2;i++) {   //...............Smart Approach --> nested for
			for(int j=0;j<2;j++) {
			System.out.print(arr1[i] [j]);
			}
			System.out.println();
		}
	}

}
