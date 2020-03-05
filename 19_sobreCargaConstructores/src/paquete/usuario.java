package paquete;

public class usuario {
	
	public String username;
	private String password;
	
	//sobre carga de constructor
	public usuario(String username, String password){
		
		this.username = username;
		this.password = password;
	
	}
	
	public usuario(){
		
		this.username = " ";
		this.password = " ";
	
	}
	
	public usuario(String username){
		
		this.username = username;
	
	
	}
	
//-------------------------------------------------

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	void saludo() {
		System.out.println("Hola "+this.username);
	}
	
	
}
