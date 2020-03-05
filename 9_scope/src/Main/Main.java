package Main;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * scope: Un scope es el area donde una variable puede ser utilizada
		 * 
		 */
		
		int promedio = 10;
		
		if(promedio ==10) 
			{
				String mensaje = "Felicidades , tu promedio es de "+promedio;
				if(promedio==10) 
					{
						System.out.println(mensaje);
						String mensaje2 = "Hola";
						
						if(true) 
							{
								System.out.println(mensaje2);
							}
						
					}
				
			}
		
	
		
	}

}
