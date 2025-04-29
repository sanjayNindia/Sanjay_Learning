package concepts.java.practice;

import java.util.Scanner;

public class WriteTables {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the value of table which you want to print: ");
		
		int value = read.nextInt();
		
		System.out.println("Enter the value till where the"+value+"should multiply: ");
		
		int multiplyTill = read.nextInt();
		
		for(int i=1; i<=multiplyTill; i++) {
			
			int ans = value * i;
			System.out.println(value +" X "+i+" = "+ ans);
			
		}
		read.close();
		
	}
}
