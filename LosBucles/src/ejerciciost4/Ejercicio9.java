package ejerciciost4;

import java.util.Scanner;

public class Ejercicio9 {

    public void escribirMultiplo(Scanner teclado) {
        System.out.println("Escriba un múltiplo de 3");
        int valor = teclado.nextInt();
        while (valor % 3 != 0) {
            System.out.printf("Error %d no es un multiplo de 3%n", valor);
            valor = teclado.nextInt();
        }
        System.out.printf("Ok: %d es un multiplo de 3%n", valor);

    }
}
