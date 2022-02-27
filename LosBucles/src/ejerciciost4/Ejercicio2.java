package ejerciciost4;

import java.util.Scanner;

public class Ejercicio2 extends Ejercicio1 {
    Scanner teclado = new Scanner(System.in);

    protected int contador = 0;
    private double valorIntroducido;

    public void calcularMediav2(Scanner teclado){
        sumaTotal = 0;
        do{
           System.out.print("Introduzca valor (-1 para terminar): "); 
           valorIntroducido = teclado.nextDouble(); 
           if(valorIntroducido != -1){ 
           listaNotas.add(valorIntroducido);
           contador++;
           }
           
       }while(valorIntroducido != -1);

       for (Double valor : listaNotas) {
           sumaTotal += valor;
           
       }
       System.out.print("Media = " + sumaTotal/contador);
    
       
    }
    
}



