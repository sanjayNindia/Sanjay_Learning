package brushup.java;

public class MethodOverLoading {

	public static int sum(int a, int b) {
		return a+b;
	}

	public static String greetUser(){
	 return "Hello, Welcome to Java";
	}

	public static char yesOrNo(){
		return 'Y';
	}

	public static boolean trueOrFalse(){
		return true;
	}

	public static double result(double a, double b){
		return a/b;
	}

	public static void main(String[] agrs) {
		
		char result = yesOrNo();
		System.out.println("Are you in the Right Path? Ans:"+result);

		String message = greetUser();
		System.out.println(message);

		int ans = sum(10,20);
		System.out.println("The Sum Of two Number:" +ans);

		boolean beleive = trueOrFalse();
		System.out.println("If you believe yourself you will succeed it's :"+beleive);
	
		double finalAns = result(121, 123);
		System.out.println("The Decimal result is:" +finalAns);

	}
}
