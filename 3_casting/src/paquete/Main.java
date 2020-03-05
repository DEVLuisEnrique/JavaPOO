package paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vx =50, vy=10;
        float vz = 5.5f;

        float resultado;

        resultado = (float)vx + vz;
        
        System.out.println(resultado);
        
        JOptionPane.showMessageDialog(null, "Hola Mundo!\n"+resultado);
       

	}

}
