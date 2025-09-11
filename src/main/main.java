package main;

import java.util.Scanner;

import AppCine.Cine;
import AppCine.Pelicula;
import AppCine.Usuario;

public class main {

	public static void main(String[] args) {

		// Crear peliculas
		Scanner scan = new Scanner(System.in);
		

		Pelicula[] peliculas = { new Pelicula("Avengers: Endgame", 181, 12, 12.50, "AVE001"),
				new Pelicula("The Batman", 176, 16, 11.00, "BAT002"),
				new Pelicula("Spider-Man: No Way Home", 148, 12, 10.50, "SPI003"),
				new Pelicula("Dune", 155, 13, 13.00, "DUN004"), new Pelicula("Encanto", 102, 0, 9.50, "ENC005") };

		// Crear salas bidimensionales
		// Aqui iria la sala de cine lo de NEW SALA (new SalaDeCine("SALA1")

		// Crear cine

		Cine cine = new Cine("CineMax", salas);

		// Crear usuarios
		Usuario[] usuarios = { new Usuario("Gisleno Babarro", "12345678A", 25, 100.00),
				new Usuario("Mario Ferron", "87654321B", 30, 80.00),
				new Usuario("Carlos López", "11223344C", 17, 50.00) };

		// Procesar turnos de usuarios
		for (int i = 0; i < usuarios.length; i++) {
			Usuario usuarioActual = usuarios[i];
			System.out.println("\n=== TURNO DE: " + usuarioActual.getNombre() + " ===");

			boolean usuarioActivo = true;

			while (usuarioActivo) {
				System.out.println("\n=== MENÚ PRINCIPAL ===");
				System.out.println("1. Listar peliculas y disponibilidad");
				System.out.println("2. Comprar entradas");
				System.out.println("3. Mostrar mapa visual de ocupacion");
				System.out.println("4. Mostrar detalle completo de ocupacion");
				System.out.println("5. Pasar al siguiente usuario");
				System.out.println("6. Salir");
				System.out.print("Seleccione una opcion: ");

				int opcion = leerEntero(scan, 1, 6);

				switch (opcion) {

				case 1:
					cine.listarEstadoSalas();
					break;

				case 2:
					comprar.Entradas(scanner, cine, usuarioActual);

				}

			}

		}

	}
}
