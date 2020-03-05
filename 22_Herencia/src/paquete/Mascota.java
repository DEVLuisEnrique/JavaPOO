package paquete;

public class Mascota {
	public String nombre;
	public String raza;
	public int edad;
	
	
	
	public void dormir() {
		System.out.println("La mascota esta durmiendo");
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getRaza() {
		return raza;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
