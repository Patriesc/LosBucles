package ejerciciost4;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio1 {

    protected ArrayList<Double> listaNotas = new ArrayList<>();
    protected int numValores;
    protected int sumaTotal;


    public void notaMedia(Scanner teclado){
        sumaTotal = 0;
        System.out.println("Introduzca el número de valores cuyo promedio desea conocer: ");
        numValores = teclado.nextInt();
        for (int i = 0; i < numValores; i++) {
         System.out.print("Introduzca valor: ");
         listaNotas.add(teclado.nextDouble());
        }
        for (Double valor : listaNotas) {
            sumaTotal+=valor;
        }
        System.out.println("La nota media es: " + sumaTotal/numValores);
    }
}
