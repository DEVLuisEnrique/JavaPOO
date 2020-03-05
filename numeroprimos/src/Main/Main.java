package Main;

public class Main {

	public static void main(String[] args) {
		
		// 0,1,1,2,3,5,8,13,24,34...n
		
		int num1 = 11,num2;
		num2 =  num1 -1;
		
		
		while((num1 % num2) !=0) {
			num2--;
			
		}
		
		if(num2 == 1) 
			{
				System.out.println("Es primo!");
			}
		else
			{
			System.out.println("No es primo!");
			}
		
		
		
		/*
		int num1 = 5;
		int num2 = num1 -1;
		
		while((num1 % num2) != 0) 
			{
				num2--;
			}
		if(num2 == 1) 
			{
				System.out.println("Es primo!");
			}
		else 
			{
				System.out.println("No es primo!");
			}*/
		
		
		
		
		
		

		
	}
}
