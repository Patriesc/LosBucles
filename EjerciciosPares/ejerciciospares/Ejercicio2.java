package ejerciciospares;

import java.util.Scanner;

public class Ejercicio2 {
    int numeroNota = 0;
    double promedio = 0;
    Scanner teclado = new Scanner(System.in);

    public void calcularMedia(Scanner teclado){
        System.out.println("Introduzca el número de notas: ");
        numeroNota  = teclado.nextInt();
       for (int i = 0; i < numeroNota; i++) {
           System.out.println("Nota:");
           double nota = teclado.nextDouble();
           promedio += nota;

           
       }
       promedio = promedio/numeroNota;
       System.out.println(String.format("La media es %f ", promedio));
    }


}
