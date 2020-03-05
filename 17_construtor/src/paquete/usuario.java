package paquete;

public class usuario {
	
	public String username;
	private String password;
	
	//constructor
	public usuario(String username, String password){
		
		this.username = username;
		this.password = password;
	
	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
