package brushup.java;


public class BrushUpMethods {

	public static void main(String[] args) {
		
		BrushUpMethods obj = new BrushUpMethods();
		
		obj.getDetails();
		getDetails1();
		
		CommonMethods obj1 = new CommonMethods();
		
		String text = obj1.getDetails3();
		
		System.out.println(text);
			
		}
	public void getDetails() {
		System.out.println("Hello World!");
	}
	
	public static void getDetails1() {
		System.out.println("Hello World-2!");
	}
}
