package brushup.java;

public class Excersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int numbers[] = new int[5];
		    
		    numbers[0] = 9;
		    numbers[1] = 13;
		    numbers[2] = 43;
		    numbers[3] = 80;
		    numbers[4] = 12;
		    
		    System.out.println("The First Element of an array is:" + numbers[0]);
		    System.out.println("The Last Element of an array is:" + numbers[4]);
		    
		    int temp = numbers.length;
		    int sum = 0; 
		    System.out.print("The Reverse order of an array is:");
		    for(int i = temp; i<=numbers.length;){
		    	i = i - 1;
		    	if(i == -1)
		    	{
		    		break;
		    	}else 
		    	{
		    		System.out.print(" "+numbers[i]);
			        temp = i;
		    	}
		    }
		    System.out.println();
		   for(int j = 0;j<numbers.length;j++) {
			   sum = sum + numbers[j];
		   }System.out.print("The sum of all elements:" +sum);
		}

}
