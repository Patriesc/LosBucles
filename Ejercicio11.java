package ejerciciospares;

import java.util.Scanner;

public class Ejercicio11 {
    Scanner teclado = new Scanner(System.in);
    int opcion = 0;
public void ascii(Scanner teclado){
    do{
        System.out.println("¿tamaño?");
        int tamaño = teclado.nextInt();
        System.out.println("¿Carácter?");
        teclado.nextLine();
        String caracter = teclado.nextLine();
        System.out.println("¿foma?");
        menu();
        opcion = teclado.nextInt();
        switch(opcion){
            case 1:
            for (int i = 0; i < tamaño; i++) {
                System.out.println();
                for (int j = 0; j < tamaño; j++) {
                    System.out.print(caracter); 
                    
                }
            }
            break;
            case 2:
            for (int fila = 1; fila <= tamaño; fila++) {
                for (int columna = 1; columna <= tamaño; columna++) {
                  if(fila == 1 || fila == tamaño || columna == 1 || columna == tamaño){
                      System.out.print(caracter);
                  }else{
                      System.out.print(" ");
                  }
                }
                System.out.println();   
            }
            break;
            case 3 :
            for (int fila = 1; fila <= tamaño; fila++) {
                for (int columna = 1; columna <= fila; columna++) {
                  if(fila ==1 ||fila == tamaño  || columna == tamaño){
                      System.out.print(caracter);
                  }else{
                      System.out.print(" ");
                  }
                }
                System.out.println();   
            }
            break;
            case 4:
            break;
            case 5:
            break;
            case 6:
            break;
            case 7:
            break;
            default:
            System.out.println("La opción elegida no existe.");

        }
    }while(opcion!=7);
}

public static void menu(){
System.out.println("1 - rectángulo con relleno");
System.out.println("2 - rectángulo sin relleno");
System.out.println("3 - cruz de San Andrés");
System.out.println("4 - triángulo rectángulo");
System.out.println("5 - rombo");
System.out.println("6 - ajedrezado");
System.out.println("7 - salir");


}

}



