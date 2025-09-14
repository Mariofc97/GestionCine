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

	public Cine(String nombre, SalaDeCine[] salas) {
		this.nombre = nombre;
		if (salas != null) {
			this.salas = salas;
		} else {
			this.salas = new SalaDeCine[0];
		}
	}

	public SalaDeCine[] salasConHueco(int n) {
		if (salas == null || salas.length == 0 || n < 1) {
			return new SalaDeCine[0];
		}

		int contador = 0;
		for (int i = 0; i < salas.length; i++) {
			if (salas[i] != null && salas[i].huecosLibres() >= n) {
				contador++;
			}
		}

		int count = 0;
		SalaDeCine[] salasLibres = new SalaDeCine[count];

		for (int i = 0; i < salas.length; i++) {
			if (salas[i] != null && salas[i].huecosLibres() >= n) {
				salasLibres[count] = salas[i];
				count++;
			}

		}

		return salasLibres;
	}

	public void listarEstadoCine() {
		System.out.println("Cine " + nombre + " - Estado de todas las salas: ");
		if (salas == null || salas.length == 0) {
			System.out.println("(Sin salas)");
			return;
		}
		for (int i = 0; i < salas.length; i++) {
			SalaDeCine sala = salas[i];
			if (sala == null) {
				continue;
			}
			sala.mostrarSalaCine();
			System.out.println();
		}
	}

	public void listarPelisDisponibles() {
		System.out.println("Disponibilidad de las peliculas: ");
		for (int i = 0; i < salas.length; i++) {
			SalaDeCine sala = salas[i];
			if (sala == null) {
				continue;
			}
			sala.disponibilidad();
			System.out.println();
		}
	}
	
	public static Cine abrirCine() {
		Pelicula peli1 = new Pelicula("Avengers: Endgame", 181, 12.50, 1);
		Pelicula peli2 = new Pelicula("The Batman", 176, 11.00, 2);
		Pelicula peli3 = new Pelicula("Spider-Man: No Way Home", 148, 12.00, 3);
		Pelicula peli4 = new Pelicula("Dune", 155, 13.00, 4);
		Pelicula peli5 = new Pelicula("Encanto", 102, 9.50, 5);

		// Crear salas de cine
		SalaDeCine sala1 = new SalaDeCine(1, peli1, 6, 7); // 6 filas 7 columnas
		SalaDeCine sala2 = new SalaDeCine(2, peli2, 7, 8); // 7 filas 8 columnas
		
		return new Cine("CineMax", new SalaDeCine[] { sala1, sala2 });
		
	}
}
