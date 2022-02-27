package ejerciciost4;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio8 extends Ejercicio7{
    int opcion = 0;
    private final String cm2 = "Son dos, o esque he bebido. Son identicas";
    private final String jb2 = "Mi nombre es Bond, James Bond";
    private final String vlrt2 = "¡No te enfades, quitarás el color!";
    private final String sw2 = "Si el orgullo es doble, doble es la caída.";

    public void mostrarPeliculas(Scanner teclado){
    do{
        menuCitas();
        opcion = teclado.nextInt();
        Random rd  =new Random();
        int cita = rd.nextInt(3);
        switch(opcion){
            case 1:
            if(cita== 1){
                System.out.println(cm1);
            }else{
                System.out.println(cm2);
            }
            break;
            case 2:
            if(cita== 1){
                System.out.println(jb1);
            }else{
                System.out.println(jb2);
            }
            break;
            case 3:
            if(cita== 1){
                System.out.println(vlrt1);
            }else{
                System.out.println(vlrt2);
            }
            break;
            case 4:
            if(cita== 1){
                System.out.println(sw1);
            }else{
                System.out.println(sw2);
            }
            break;
            case 5:
                System.out.println("Adiós");
                break;
            default:
            System.out.println("La opción no existe.");
        }

    }while(opcion !=5);
}

}