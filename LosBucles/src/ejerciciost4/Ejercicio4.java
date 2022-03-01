package ejerciciost4;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
    int numero = 0;
    Random random = new Random();
    int pcRandom = random.nextInt(100) + 1;

    public void adivinarNumero(Scanner teclado) {
        do {
            System.out.println("¿En que número estoy pensando?");
            numero = teclado.nextInt();
            if (numero > pcRandom) {
                System.out.println("Menor");
            } else if (numero < pcRandom) {
                System.out.println("Mayor");
            } else {
                System.out.println("Bravo, lo has encontrado.");
            }
        } while (numero != pcRandom);

    }

}
