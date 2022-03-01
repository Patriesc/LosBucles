package ejerciciost4;

import java.util.Scanner;

public class Ejercicio7 {
    protected final String cm1 = "Maravillosa Belfast";
    protected final String jb1 = "Hay un proverbio japonés que dice: en el árbol pelado no anidan los pájaros.";
    protected final String vlrt1 = "La vida es un río largo y tranquilo. Son las orillas las que son peligrosas. Nunca se debe abordar.";
    protected final String sw1 = "Concéntrate en el momento; siente, no pienses.";
    protected int opcion = 0;

    public void mostrarPeliculas(Scanner teclado) {
        do {
            menuCitas();
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(cm1);
                    break;
                case 2:
                    System.out.println(jb1);
                    break;
                case 3:
                    System.out.println(vlrt1);
                    break;
                case 4:
                    System.out.println(sw1);
                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("La opción no existe.");
            }

        } while (opcion != 5);
    }

    protected static void menuCitas() {
        System.out.println("1 - Una cita de la ciudad del miedo");
        System.out.println("2 - Una cita de James Bond");
        System.out.println("3 - Una cita de la vida es un largo río tranquilo");
        System.out.println("4 - Una cita de Star Wars");
        System.out.println("5 - Salir de esta magnífica aplicación");
    }
}