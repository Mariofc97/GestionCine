package AppCine;

public class SalaDeCine {

	private int id;
	private String [][] capacidad;
	private Pelicula pelicula;
	private Usuario[] butacas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[][] getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String[][] capacidad) {
		this.capacidad = capacidad;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public Usuario[] getButacas() {
		return butacas;
	}
	public void setButacas(Usuario[] butacas) {
		this.butacas = butacas;
	}
	
	public SalaDeCine(int id, Pelicula pelicula, Usuario[] butacas) {
		this.id = id;
		this.pelicula = pelicula;
		this.butacas = new Usuario[0];
	}
	
	
}
