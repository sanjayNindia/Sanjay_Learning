package brushup.java;


import java.util.Arrays;
import java.util.List;

public class LearningArrays {

	public static void main(String[] args) {
		
		String[] name = {"Sanjay", "Manoj", "Kiran"};
		
		List<String> ArrLst = Arrays.asList(name);
		
		for(String val: ArrLst) {
			System.out.println(val);
		}
	System.out.println(ArrLst.contains("Manoj"));
	}   
}
