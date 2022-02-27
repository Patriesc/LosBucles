package ejerciciost4;

import java.util.Scanner;

public class Ejercicio10 {
    Scanner teclado = new Scanner(System.in);

    public void mostrarASCII(Scanner teclado){
        System.out.println("¿Anchura?");
        int anchura = teclado.nextInt();
        System.out.println("¿Altura?");
        int altura = teclado.nextInt();
        System.out.println("¿Carácter?");
        teclado.nextLine();
        String caracter = teclado.nextLine();
        
        for (int i = 0; i < altura; i++) {
            System.out.println();
            for (int j = 0; j < anchura; j++) {
                System.out.print(caracter); 
                
            }
             System.out.println();
        }
        
    }
}
