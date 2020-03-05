package paquete;

public class Operaciones {
	float valor1;
	float valor2;
	float resultado;
	
	
	float getSuma(float valor1, float valor2) {
		
		this.valor1 = valor1;
		this.valor2 = valor2;
		
		this.resultado = valor1+valor2;
		
		return resultado;
	}
int getSuma(int valor1, int valor2) {
		
		this.valor1 = valor1;
		this.valor2 = valor2;
		
		this.resultado = valor1+valor2;
		
		return (int) resultado;
	}
	
	
	float getResta(float valor1, float valor2) {
			
			this.valor1 = valor1;
			this.valor2 = valor2;
			
			this.resultado = valor1-valor2;
			
			return resultado;
		}

}
