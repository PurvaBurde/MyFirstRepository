package system;

import java.util.Scanner;

public class scanner_new {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value");
		int var=obj.nextInt();
		if(var%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		System.out.println("Enter string value");
		
	}
}
