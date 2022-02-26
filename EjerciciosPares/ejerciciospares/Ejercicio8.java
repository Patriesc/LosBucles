package ejerciciospares;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    Scanner teclado = new Scanner(System.in);
    int opcion = 0;
    final String cm1 = "Maravillosa Belfast";
    final String cm2 = "Son dos, o esque he bebido. Son identicas";
    final String jb1 = "Hay un proverbio japonés que dice: en el árbol pelado no anidan los pájaros.";
    final String jb2 = "Mi nombre es Bond, James Bond";
    final String vlrt1 = "La vida es un río largo y tranquilo. Son las orillas las que son peligrosas. Nunca se debe abordar.";
    final String vlrt2 = "¡No te enfades, quitarás el color!";
    final String sw1 = "Concéntrate en el momento; siente, no pienses.";
    final String sw2 = "Si el orgullo es doble, doble es la caída.";

    public void mostrarPeliculas(Scanner teclado){
    do{
        menu();
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
public static void menu(){
    System.out.println("1 - Una cita de la ciudad del miedo");
    System.out.println("2 - Una cita de James Bond");
    System.out.println("3 - Una cita de la vida es un largo río tranquilo");
    System.out.println("4 - Una cita de Star Wars");
    System.out.println("5 - Salir de esta magnífica aplicación");
}
}