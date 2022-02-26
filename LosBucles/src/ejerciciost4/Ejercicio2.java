package ejerciciost4;

import java.util.Scanner;

public class Ejercicio2 extends Ejercicio1 {
    Scanner teclado = new Scanner(System.in);

    private int contador = 0;
    private double valorIntroducido;

    public void calcularMedia(Scanner teclado){
        sumaTotal = 0;
        do{
           System.out.print("Introduzca valor: "); 
           valorIntroducido = teclado.nextDouble(); 
           if(valorIntroducido != -1){ 
           listaNotas.add(valorIntroducido);
           contador++;
           }
           
       }while(valorIntroducido != -1);

       for (Double valor : listaNotas) {
           sumaTotal += valor;
           
       }
       System.out.println("La nota media es: " + sumaTotal/contador);
    
       
    }
}



