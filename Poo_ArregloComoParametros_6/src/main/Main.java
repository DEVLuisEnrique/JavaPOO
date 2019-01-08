package main;

import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		//ARREGLOS COMO PARAMETROS

		int numeros[] = {2,4,5,6};
		String empleados[] = {"Luis","Rodriguez","Juna","Emilio","Maikel",
				"David","carlos","josmar","jose","edward","alex","gilberto","yefri",
				"yeudi","yanuel","cristofel","crismeli","leo",};
		float decimales[] = new float[10];
		
		
		
		
		ClassArreglo c = new ClassArreglo();
		
		c.RellenarArreglo(decimales);
		c.OrganizarArreglo(decimales);
		c.ImprimirArreglo(decimales);
		
		
	}

}
