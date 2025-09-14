package main;

import java.util.Scanner;

import AppCine.Cine;
import AppCine.Usuario;

public class main {

	public static void main(String[] args) {

		Cine cine = Cine.abrirCine();

		Usuario[] compradores = { new Usuario("Gisleno Babarro", "12345678A"), new Usuario("Mario Ferron", "87654321B"),
				new Usuario("Carlos López", "11223344C") };

		Scanner scan = new Scanner(System.in);
		
		for (Usuario u: compradores) {
			ConsolaCine.ejecutarTurno(cine, u, scan);
		}

	}
}
