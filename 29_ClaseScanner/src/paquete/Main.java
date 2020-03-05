package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		System.out.println(" ");
		
		System.out.print("Ingre Edad: ");
		int edad = sc.nextInt();
		System.out.println("");
		
		System.out.print("Cual es tu altura? ");
		float altura = sc.nextFloat();
		System.out.println(" ");
		sc.nextLine();
		System.out.print("El curso es de tu agrado? (si/no)");
		boolean valor = sc.nextLine().equals("si"); //sc.nextBoolean();
		System.out.println(" ");
		
		
		System.out.print("Hola "+nombre+"\nSu edad es "+edad
				+"\nAltura: "+altura+"\nRespuesta: "+valor);
		sc.close();
		
	}

}
