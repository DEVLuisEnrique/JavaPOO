package Main;

public class Main {

	public static void main(String[] args) {
		
		// 0,1,1,2,3,5,8,13,24,34...n
		
		 int num1 = 0,num2 =1;

	      for(int cont = 1; cont <= 50;)
	        {
	    	  System.out.print(cont+", ");
	    	  cont = num1+num2;
	    	  num1 = num2;
	    	  num2 = cont; 

	        }

		
	}
}
