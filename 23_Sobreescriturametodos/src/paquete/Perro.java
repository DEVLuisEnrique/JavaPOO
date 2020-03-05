package paquete;

public class Perro extends Mascota {
	
	/*public Perro(String nombre, String raza, int edad) {
		super(nombre,raza,edad);
	}*/
	
	
	@Override
	public void dormir() {
		super.dormir(); //super = clase padre
		System.out.println("El perro duerme");
	}
	
	
}
