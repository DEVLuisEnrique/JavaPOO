package Main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int numero,f=1;
	numero = sc.nextInt();
	
	
	for(int i = 1; i <= numero; i++) 
		{
			f = f * i;
		}
	
	System.out.println("El factorial es: "+f);
		
	}
}
