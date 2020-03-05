package paquete;

public class Triangulo extends Figura {
	private float base,altura;
	
	@Override
	public float area() {
		return (base*altura)/2;
	}

	public void setBaseAltura(float base,float altura) {
		this.base = base;
		this.altura = altura;
	}
	

	
}
