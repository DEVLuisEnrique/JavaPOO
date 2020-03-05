package Main;

public class Main {

	public static void main(String[] args) {
		
		 int matriz[][] =  new int[5][5];  
         float promediomatriz = 0;
         int sumamatriz = 0;
         int tamanomatriz = matriz.length, nummayor= matriz[0][0];
         int rep=0;
         //entrada de datos
         for(int fila = 0; fila < matriz.length; fila++)
             {
                 for(int columna = 0; columna < matriz[fila].length; columna++)
                     {   
                         matriz[fila][columna] = (int)(Math.random()*100);
                     }
             }
         //-----------------------------------------------------------

         for(int fila = 0; fila < matriz.length; fila++)
             {
                 for(int columna = 0; columna < matriz[fila].length; columna++)
                     {   
                        // System.out.println("matriz["+fila+"]["+columna+"] = "+matriz[fila][columna]);
                         sumamatriz = sumamatriz + matriz[fila][columna];
                         
                         /*if(matriz[fila][columna] > nummayor)  //numero mayor
	                      	{
	                     	 	
	                     	 	nummayor = matriz[fila][columna];
	                     	 	rep++;
	                      	}*/
                         
                         //numeros pares
                         if(matriz[fila][columna] %2 ==0) 
                         	{
                        	 	System.out.println("Pares["+fila+"]["+columna+"] = "+matriz[fila][columna]);
                        	 	if(matriz[fila][columna] > nummayor)  //numero mayor
    	                      		{
    	                     	 	
	    	                     	 	nummayor = matriz[fila][columna];
	    	                     	 	rep++;
    	                      		}
                         	}
                     }
                   
             } 
         //------------------------------------------------------------------
         		System.out.println("numero mayor ("+nummayor+") \tRepeticion ("+rep+")");
             promediomatriz = sumamatriz / matriz.length;
             System.out.println(sumamatriz);
             System.out.println(tamanomatriz);
             System.out.println(promediomatriz);
		
		
		
		

		
	}
}
