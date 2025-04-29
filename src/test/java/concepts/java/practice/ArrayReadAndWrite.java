package concepts.java.practice;

import java.util.Scanner;

public class ArrayReadAndWrite {
	
	public static void main(String[] args) {
		
		
		Scanner readArrray = new Scanner(System.in);
		
	
		System.out.print("Enter the size of an array: ");
		int n = readArrray.nextInt();
		
		int[] numbers = new int[n];
		
		System.out.print("Enter "+n+" values: ");
		for(int i=0; i<n ; i++) {
			numbers[i] = readArrray.nextInt();
		}
		System.out.print("The Values of Array is: ");
		for(int data:numbers) {
			System.out.println(data);
		}
		readArrray.close();
	}

}
