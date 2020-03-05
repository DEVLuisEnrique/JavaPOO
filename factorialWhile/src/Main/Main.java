package Main;

public class Main {

	public static void main(String[] args) {
		
	
		 /*
        5! = 1x2x3x4x5=120
        n!=
        x
    
    int factorial=4;
    int c=1,f=1;

    while(c <= factorial)
        {
    	 System.out.println(c);
          c++; 
         
          f = c * factorial;
          
          
        }
    System.out.println("\n");
    System.out.println(f);*/
		
	int f=1,n=0;
	int factorial=4;
	
	while(n < factorial) 
		{
			n=n+1;
			f =f*n;
			
		}
	System.out.println("El factorial de "+factorial+" es: "+f);
	
	}
}
