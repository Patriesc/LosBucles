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
            for (int filas = 0;filas < tamaño; filas++) {
                System.out.println();
                for (int columnas = 0; columnas < tamaño; columnas++) {
                    System.out.print(caracter); 
                    
                }
            }
            break;
            case 2:
            for (int filas = 1; filas <= tamaño; filas++) {
                for (int columnas = 1; columnas <= tamaño; columnas++) {
                  if(filas == 1 || filas == tamaño || columnas == 1 || columnas == tamaño){
                      System.out.print(caracter);
                  }else{
                      System.out.print(" ");
                  }
                }
                System.out.println();   
            }
            break;
            case 3 :
            for (int filas = 1; filas <= tamaño; filas++) {
                for (int columnas = 1; columnas <= filas; columnas++) {
                  if(filas ==1 ||filas == tamaño  || columnas == tamaño){
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
            for (int columnas=1; columnas< tamaño; columnas++) {
	
                for (int filas=1; filas<=tamaño; filas++) {
                  
                System.out.print(caracter);
                System.out.print("  ");
              }
                  
                System.out.println("");
                for (int filas=1; filas<tamaño; filas++) {
                      
                  System.out.print("  ");
                  System.out.print(caracter);  
               } 
               System.out.println("");
            }
            break;
            default:
            System.out.println("La opción elegida no existe.");
            break;

        }
    }while(opcion!=6);
}

public static void menu(){
System.out.println("1 - rectángulo con relleno");
System.out.println("2 - rectángulo sin relleno");
System.out.println("3 - cruz de San Andrés");
System.out.println("4 - triángulo rectángulo");
System.out.println("5 - rombo");
System.out.println("6 - ajedrezado y salir");


}

}



