package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro dog = new Perro();
		Gato cat = new Gato();
		
		dog.dormir();
		System.out.println(dog.getNombre());
		cat.dormir();
		System.out.println(cat.getNombre());
		
		
	}

}
