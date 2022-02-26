package ejerciciospares;

import java.util.Scanner;

public class Main{
public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    Ejercicio2 prueba2 = new Ejercicio2();
    Ejercicio4 prueba4 = new Ejercicio4();
    Ejercicio6 prueba6  = new Ejercicio6();
    Ejercicio8 prueba8 = new Ejercicio8();
    Ejercicio10 prueba10= new Ejercicio10();


    prueba2.calcularMedia(teclado);
    prueba4.adivinarNumero(teclado);
    prueba6.trampa(teclado);
    prueba8.mostrarPeliculas(teclado);
    prueba10.mostrarASCII(teclado);
} 

}