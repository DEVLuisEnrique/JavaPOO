package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Triangulo triangulo = new Triangulo();
		Circulo circulo = new Circulo(10.12f);
		
		triangulo.setBaseAltura(10, 10);
		
		System.out.println(triangulo.area());
		System.out.println(circulo.area());
		
		
	}

}
