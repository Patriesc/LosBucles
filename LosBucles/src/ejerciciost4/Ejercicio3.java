package ejerciciost4;

import java.util.Scanner;

public class Ejercicio3 extends Ejercicio2{

    public void notaMediav3(Scanner teclado){
        calcularMediav2(teclado);

        contador = 0;
        double superior10 = 0;
        for (Double valor : listaNotas) {
            if(valor>=10){
                superior10++;
            }
            contador++;
        }

        System.out.print("(" + (superior10 /contador)*100 + "% >=10)\n");
    }
    
}
