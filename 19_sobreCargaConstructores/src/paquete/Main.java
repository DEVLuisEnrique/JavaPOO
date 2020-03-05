package paquete;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		usuario user1 = new usuario();
		usuario user2 = new usuario("usuario2");
		usuario user3 = new usuario("usuario3","password");
		
		user1.saludo();
		user2.saludo();
		user3.saludo();
		
		//user.username = "luis";
		//user.setPassword("Hola");
		
		//System.out.println(user.username);
		//System.out.println(user.getPassword());
		
	}

}
