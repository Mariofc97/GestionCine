package AppCine;

public class Cine {

	private String nombre;
	private SalaDeCine[] salas;
	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public SalaDeCine[] getSalas() {
		return salas;
	}



	public void setSalas(SalaDeCine[] salas) {
		this.salas = salas;
	}
	
	public Cine (String nombre, SalaDeCine[] salas) {
		this.nombre = nombre;
		this.salas = new SalaDeCine[0];
	}
	
	
}
