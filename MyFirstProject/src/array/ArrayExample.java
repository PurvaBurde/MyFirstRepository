package array;

public class ArrayExample {
	
	int a;  //Normal variable declaration
	public static int []b; //Array declaration...Single dimension OR int b[];
	static int c[]= {1,2,3,4,5,6,7,8,9,10}; //Declaration + initialization
	static int RollNo[];
	int [] marks;

	public static void main(String[] args) {
		//ArrayName=new DataType [size]
		b=new int [5];     //Initialization of Array
		RollNo=new int[100];
		//Approach to assign the value to array
		/*RollNo[0]=1;
		RollNo[1]=2;
		RollNo[2]=3;*/
		
		//smart approach to assign the value		
		for(int i=0;i<100;i++) {  //i<100 bcz indexing starts from '0', so last indexing=last no.- 1
			RollNo[i]=i+1;
		}
		System.out.println("First student of school "+ RollNo[0]);
		System.out.println("Last student of school "+ RollNo[99]);
		
		//Instance Array initialization
		ArrayExample obj=new ArrayExample();
		obj.marks=new int[5]; //.....................................................1)
		
		//Condition 1 : if you try to access array out of the index
		//at runtime you will get the Arrayindexoutofbound exception
		//so you can't access array part from declare size, you have to increase it by overriding
		//obj.marks[6]=45;
		obj.marks=new int[10]; //....................................................2) size overrided
		obj.marks[6]=45;
	}

}
