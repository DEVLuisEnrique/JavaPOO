package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		usuario user = new usuario();
		
		user.username = "luis";
		user.setPassword("Hola");
		
		System.out.println(user.username);
		System.out.println(user.getPassword());
		
	}

}
