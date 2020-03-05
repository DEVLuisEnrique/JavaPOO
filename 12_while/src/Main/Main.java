package Main;

public class Main {

	public static void main(String[] args) {
		
	
	int contador = 0;
	int num = 12345622;
	
	while(num > 0) 
		{
			num = num / 10;
			contador++;
				
		}
	System.out.println("El numero posee "+contador+" digitos");
	
		
	}

}
