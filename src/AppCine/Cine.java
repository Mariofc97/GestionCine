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
}
