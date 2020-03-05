package Main;

public class Main {

	public static void main(String[] args) {
		
		//matrices

        int matriz[][] = new int[4][3];
        //primer valor filas
        //segundo valor columnas

        

        for(int posX = 0; posX < matriz.length; posX++)//ingresamos datos en la matriz
            {
                for(int posY = 0; posY < matriz[posX].length; posY++)
                    {
                       matriz[posX][posY] = posX+1; 
                    }

            }
        
        for(int posX = 0; posX < matriz.length; posX++)//ingresamos datos en la matriz
        {
            for(int posY = 0; posY < matriz[posX].length; posY++)
                {
                    System.out.println(matriz[posX][posY]);
                }

        }

		
	}
}
