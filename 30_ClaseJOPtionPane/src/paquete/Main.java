package paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = JOptionPane.showInputDialog(null,"Cual es tu nombre? ","Nombre Completo");
		int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Edad","edad"));
		
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		JOptionPane.showMessageDialog(null, nombre+"\n"+edad);
	}

}
