package ejerciciost4;

import java.util.Scanner;

public class Ejercicio9 {
    Scanner teclado = new Scanner(System.in);
    private int valor;

    public void escribirMultiplo(Scanner teclado){
        System.out.println("Escriba un múltiplo de 3");
        valor = teclado.nextInt();
        while(valor%3 != 0){
            System.out.println(String.format("Error %d no es un multiplo de 3", valor));
            valor = teclado.nextInt();
        }
        System.out.println(String.format("Ok: %d es un multiplo de 3", valor));

    }
}
