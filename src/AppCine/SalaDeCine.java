package AppCine;

public class SalaDeCine {

	private int id;
	private int filas;
	private int columnas;
	private Pelicula pelicula;
	private Usuario[][] butacas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Usuario[][] getButacas() {
		return butacas;
	}

	public void setButacas(Usuario[][] butacas) {
		this.butacas = butacas;
	}

	public SalaDeCine(int id, Pelicula pelicula, int filas, int columnas) {
		this.id = id;
		this.pelicula = pelicula;
		this.filas = filas;
		this.columnas = columnas;
		this.butacas = new Usuario[filas][columnas];
	}

	public int huecosLibres() {
		int libres = 0;
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				if (butacas[i][j] == null) {
					libres++;
				}
			}
		}

		return libres;

	}

	public int[][] comprarEntradas(Usuario user, int n) {
		if (user == null || n < 1) {
			return new int[0][0];
		}
		
		if(huecosLibres()<n) {
			return new int[0][0];
		}

		int[][] asignadas = new int[n][2];
		int contador = 0;

		for (int i = 0; i < butacas.length && contador < n; i++) {
			for (int j = 0; j < butacas[i].length && contador < n; j++) {
				if (butacas[i][j]==null) {
					butacas[i][j] = user;
					asignadas[contador][0] = i;
					asignadas[contador][1] = j;
					contador++;

				} 
			}

		}

		return asignadas;

	}

	public void mostrarSalaCine() {
		disponibilidad();
		System.out.println("Butacas: ");
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				String etiqueta;
				if (butacas[i][j] == null) {
					etiqueta = "_";
				} else {
					etiqueta = butacas[i][j].getNombreUsuario();
				}
				System.out.println("[" + etiqueta + "]");
			}

		}
	}
	
	public void disponibilidad() {
		System.out.println("------Sala Cine " + getId()+"------");
		System.out.println("Pelicula: " + pelicula.getTitulo());
		System.out.println("\nButacas libres: " + huecosLibres());
		System.out.println("Precio por entrada: " + pelicula.getPrecio());
		
	}
}
