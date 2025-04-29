package brushup.java;

import java.util.ArrayList;


public class LearningArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("Hello World");
		array.add("Comeback!");
		
		System.out.print("The value of an ArrayList: " + array.get(0)+ ", " + array.get(1) );
	}
}
