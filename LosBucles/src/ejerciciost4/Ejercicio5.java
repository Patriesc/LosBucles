package ejerciciost4;

import java.util.Scanner;

public class Ejercicio5{
    private int eleccionPc;
    private String respuesta;

    public void ahoraYo(Scanner teclado){
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla. ");
        teclado.nextLine();
        do{
            eleccionPc = (int)(Math.random()*100);
            System.out.println(String.format("Pruebo con %d, ¿es mayor, menor o es el número (+/-/=)?", eleccionPc));
            respuesta = teclado.next();
            if(respuesta.equals("+")){
                
            }
        }while(respuesta!= "=");

    }
}
