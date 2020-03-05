package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Operaciones op = new Operaciones();
		float valor1,valor2;
		
		
		System.out.print("Ingrese el primer valor: ");
		valor1 = sc.nextFloat();
		System.out.print("Ingrese el segundo valor: ");
		valor2 = sc.nextFloat();
		
		System.out.println(op.getSuma(valor1, valor2));
		System.out.println(op.getResta(valor1, valor2));
		
		
	}

}
