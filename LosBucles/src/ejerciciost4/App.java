package ejerciciost4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int option;
        Ejercicio1 ejercicio1 = new Ejercicio1();
        Ejercicio2 ejercicio2 = new Ejercicio2();
        Ejercicio3 ejercicio3 = new Ejercicio3();
        Ejercicio4 ejercicio4 = new Ejercicio4();
        Ejercicio5 ejercicio5 = new Ejercicio5();
        Ejercicio6 ejercicio6 = new Ejercicio6();
        Ejercicio7 ejercicio7 = new Ejercicio7();
        Ejercicio8 ejercicio8 = new Ejercicio8();
        Ejercicio9 ejercicio9 = new Ejercicio9();
        Ejercicio10 ejercicio10 = new Ejercicio10();
        Ejercicio11 ejercicio11 = new Ejercicio11();

        do {
            System.out.println("\n***************************");
            System.out.println("Elija una de las opciones: ");
            menu();
            option = teclado.nextInt();
            switch (option) {
                case 1:
                    ejercicio1.notaMedia(teclado);
                    break;
                case 2:
                    ejercicio2.calcularMediav2(teclado);
                    break;
                case 3:
                    ejercicio3.notaMediav3(teclado);
                    break;
                case 4:
                    ejercicio4.adivinarNumero(teclado);
                    break;
                case 5:
                    ejercicio5.ahoraYo(teclado);
                    break;
                case 6:
                    ejercicio6.trampa(teclado);
                    break;
                case 7:
                    ejercicio7.mostrarPeliculas(teclado);
                    break;
                case 8:
                    ejercicio8.mostrarPeliculasv2(teclado);
                    break;
                case 9:
                    ejercicio9.escribirMultiplo(teclado);
                    break;
                case 10:
                    ejercicio10.mostrarASCII(teclado);
                    break;
                case 11:
                    ejercicio11.ascii2(teclado);
                    break;

            }

        } while (option != 12);
        System.out.println("??Muchas gracias!");
    }

    private static void menu() {

        System.out.println("1. La nota media (versi??n 1)");
        System.out.println("2. La nota media (versi??n 2)");
        System.out.println("3. La nota media (versi??n 3)");
        System.out.println("4. Adivina en qu?? n??mero estoy pensando");
        System.out.println("5. Ahora tengo que encontrarlo yo");
        System.out.println("6. ??Qu?? hace este algoritmo?");
        System.out.println("7. Visualizaci??n de citas de pel??culas (versi??n 1)");
        System.out.println("8. Visualizaci??n de citas de pel??culas (versi??n 2");
        System.out.println("9. Escribir un m??ltiplo de tres");
        System.out.println("10.Arte ASCII 1");
        System.out.println("11.Arte ASCII 2");
        System.out.println("12. Salir.");
    }
}
