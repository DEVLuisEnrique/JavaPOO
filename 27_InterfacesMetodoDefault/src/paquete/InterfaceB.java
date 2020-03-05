package paquete;

public interface InterfaceB {

	public void MostrarMensaje();
	
	public default void saludo() {//metodo default
		System.out.println("Hola mundo desde una interfaz");
	}
}
