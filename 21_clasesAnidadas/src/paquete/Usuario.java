package paquete;

public class Usuario {

	public String username;
	
	public Usuario(String username) {
		this.username = username;
	}
	
	public void establecerRol() {
		Administrador admin = new Administrador();
		admin.trabajar();
	}
	
	
	//clase administrador
	public class Administrador{
		
		public void trabajar() {
			System.out.println("The admin "+username+" is Working...");
		}
	
	}
	
}
