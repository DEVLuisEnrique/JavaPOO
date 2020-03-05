package paquete;

public class Circulo extends Triangulo {
	
	private float radio;
	public static final float pi = 3.141516f;
	
	
	public Circulo(float radio) {
		this.radio = radio;
		
	}
	
	public float area() {
		return Circulo.pi *(this.radio*this.radio);
	}
	
	
	
	
	
}
