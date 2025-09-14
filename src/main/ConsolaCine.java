package main;

import java.util.Scanner;

import AppCine.Cine;
import AppCine.SalaDeCine;
import AppCine.Usuario;

public class ConsolaCine {

    public static void ejecutarTurno(Cine cine, Usuario usuarioActual, Scanner scan) {
        System.out.println("\n=== TURNO DE: " + usuarioActual.getNombreUsuario() + " ===");

        boolean usuarioActivo = true;

        while (usuarioActivo) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Listar peliculas y disponibilidad");
            System.out.println("2. Comprar entradas");
            System.out.println("3. Mostrar ocupacion por sala");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scan.nextInt();

            switch (opcion) {

                case 1:
                    // Usa tu método del cine para listar
                    cine.listarPelisDisponibles();
                    break;

                case 2:
                    SalaDeCine[] todasSalas = cine.getSalas();
                    System.out.println("------------------");
                    System.out.println("¿Que sala escoges?");

                    for (int x = 0; x < todasSalas.length; x++) {
                        if (todasSalas[x].huecosLibres() == 0) {
                            System.out.println((x + 1) + ") Sala " + todasSalas[x].getId() + " esta llena.");
                            continue;
                        } else {
                            System.out.println((x + 1) + ") Sala " + todasSalas[x].getId() + " - "
                                    + todasSalas[x].getPelicula().getTitulo() + " | Libres: "
                                    + todasSalas[x].huecosLibres());
                        }
                    }

                    System.out.println("Selecciona una opcion: ");
                    int idx = scan.nextInt();

                    while (idx < 1 || idx > todasSalas.length) {
                        System.out.println("Elige una opcion entre 1 y " + todasSalas.length + ": ");
                        idx = scan.nextInt();
                    }

                    SalaDeCine sala = todasSalas[idx - 1];

                    System.out.println("¿Cuantas entradas quieres?");
                    int n = scan.nextInt();

                    int[][] butacasAsignadas = sala.comprarEntradas(usuarioActual, n);

                    double precio = 0;
                    double precioTotal = 0;

                    if (butacasAsignadas.length == 0) {
                        System.out.println("No hay butacas libres");
                    } else {
                        System.out.println("Compra realizada: " + sala.getPelicula().getTitulo() + " | Sala "
                                + sala.getId() + "\nButaca/s: ");
                        for (int y = 0; y < butacasAsignadas.length; y++) {
                            System.out.print("[Fila " + (butacasAsignadas[y][0] + 1) + ". Columna"
                                    + (butacasAsignadas[y][1] + 1) + "]");
                            System.out.println();
                            precio = sala.getPelicula().getPrecio();
                            precioTotal = precio * butacasAsignadas.length;
                        }
                        System.out.println("Precio total: " + precioTotal);
                        System.out.println();
                    }
                    break;

                case 3:
                    cine.listarEstadoCine();
                    break;

                case 4:
                    System.out.println("Adios " + usuarioActual.getNombreUsuario() + " !, vuelva pronto.");
                    usuarioActivo = false;
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }
        }
    }
}
