package Main;

public class Main {

	public static void main(String[] args) {
		
		int numeros[] = new int[100];
		int mayor = numeros[0];
		int menor = numeros[0];
		float promedio = 0;
		int suma = 0;
		//entra de datos
		
		for(int i = 1; i < numeros.length; i++)
			{
				numeros[i] =  (int)(Math.random()*100);
				
			}
		
		//-------------
		
		//salida de datos numeros pares
		
		for(int j = 1 ; j < numeros.length; j++) 
			{
			suma = suma + numeros[j];
				
				//System.out.print(numeros[j]+" ");
				if((numeros[j] % 2) == 0) 
					{
					 System.out.print(numeros[j]+", ");
					}
				
			}
		promedio = suma / numeros.length;
		//--------------
		
		//comparacion de datos
		System.out.println("");
		for(int posx = 1; posx < numeros.length; posx++) 
			{
				if(numeros[posx] > mayor) 
					{
						mayor = numeros[posx];
					}
				else if(numeros[posx] < menor) 
					{
						menor = numeros[posx];
					}
			}
		System.out.println("Numero mayor: " + mayor);
		System.out.println("Numero menor: " + menor);
		System.out.println("Promedio del arreglo: " + promedio);
		

		
	}
}
