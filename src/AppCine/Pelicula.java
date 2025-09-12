package AppCine;

public class Pelicula {

	private String titulo;
    private int duracion;
    //private int clasificacionEdad;
    private double precio;
    private int id; 
    
    
    public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	//public int getClasificacionEdad() {
		//return clasificacionEdad;
	//}


	//public void setClasificacionEdad(int clasificacionEdad) {
		//this.clasificacionEdad = clasificacionEdad;
	//}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Pelicula(String titulo, int duracion, double precio, int id) {
    	
    //this.clasificacionEdad= clasificacionEdad;
    this.duracion = duracion;
    this.titulo = titulo;
    this.precio = precio;
    this.id = id;
    }
}
