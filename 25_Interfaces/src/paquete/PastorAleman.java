package paquete;

public class PastorAleman implements Canino, Mascota{

	private String nombremascota;
	
	@Override
	public void aullar() {
		System.out.println("El pastor alemana aulla!");
	}
	
	public void setNombreMascota(String nombremascota) {
		this.nombremascota = nombremascota;
		System.out.println(this.nombremascota);
	}
}
