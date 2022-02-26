package ejerciciost4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int option = 0;
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio6 ejercicio6 = new Ejercicio6();

        do {
            System.out.println("***************************");
            System.out.println("Elija una de las opciones: ");
            menu();
            option = teclado.nextInt();
            switch (option) {
                case 1:
                    ejercicio1.notaMedia(teclado);
                    break;
                case 2:
                    ejercicio2.calcularMedia(teclado);
                    break;
                case 6:
                    ejercicio6.trampa(teclado);
                    break;

            }

        } while (option != 12);
        System.out.println("¡Muchas gracias!");
    }

    private static void menu() {

        System.out.println("1. La nota media (versión 1)");
        System.out.println("2. La nota media (versión 2)");
        System.out.println("3. La nota media (versión 3)");
        System.out.println("4. Adivina en qué número estoy pensando");
        System.out.println("5. Ahora tengo que encontrarlo yo");
        System.out.println("6. ¿Qué hace este algoritmo?");
        System.out.println("7. Visualización de citas de películas (versión 1)");
        System.out.println("8. Visualización de citas de películas (versión 2");
        System.out.println("9. Escribir un múltiplo de tres");
        System.out.println("10.Arte ASCII 1");
        System.out.println("11.Arte ASCII 2");
        System.out.println("12. Salir.");
    }
}