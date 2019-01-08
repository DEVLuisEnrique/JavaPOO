package main;

public class ClassArreglo {

	public ClassArreglo() {
		
	}
	
	//==========METODOS PARA IMPRIMIR ARREGLOS================
	
 	public void ImprimirArreglo(int []array) {
		
		for(int i=0; i < array.length;i++) 
			{
			System.out.println(i+" - "+array[i]+" ");
			}
		
	}
	public void ImprimirArreglo(String []array) {
			
			for(int i=0; i < array.length;i++) 
				{
				System.out.println(i+" - "+array[i]+" ");
				}
			
		}
	
	public void ImprimirArreglo(char []array) {
		
		for(int i=0; i < array.length;i++) 
			{
			 	System.out.println(i+" - "+array[i]+" ");
			}
		
	}
	
	public void ImprimirArreglo(float []array) {
		
		for(int i=0; i < array.length;i++) 
			{
			System.out.println(i+" - "+array[i]+" ");
			}
		
	}
	
	//============METODOS PARA RELLENAR ARREGLOS=======================
	
	public void RellenarArreglo(float[] array) {
		for(int i=0;i < array.length; i++) 
			{
				array[i] = (float) (Math.random()*100);
			}
	
	}
	
	public void RellenarArreglo(int[] array) {
		for(int i=0;i < array.length; i++) 
			{
				array[i] = (int) (Math.random()*100);
			}
	}
	
	
	//===============METODOS PARA ORGANIZAR EL ARREGLO==================
	
	public void OrganizarArreglo(int[] array) {
		int aux;
		boolean cambios=false;
		
		while(true) 
			{	cambios=false;
				for(int i=1;i<array.length;i++) {
					
					if(array[i] < array[i-1]) 
						{
							aux = array[i];
							array[i] = array[i-1];
							array[i-1] = aux;
							cambios=true;
						}
					
				}
				
				if(cambios==false) 
					{
						break;
					}
			}
		
	}
	
	public void OrganizarArreglo(float[] array) {
		float aux;
		boolean cambios=false;
		
		while(true) 
			{	cambios=false;
				for(int i=1;i<array.length;i++) {
					
					if(array[i] < array[i-1]) 
						{
							aux = array[i];
							array[i] = array[i-1];
							array[i-1] = aux;
							cambios=true;
						}
					
				}
				
				if(cambios==false) 
					{
						break;
					}
			}
		
	}
	
	
	

}
