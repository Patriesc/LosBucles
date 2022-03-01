package ejerciciost4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 extends Ejercicio4 {

    private final ArrayList<Integer> listaNums = new ArrayList<>();

    public void ahoraYo(Scanner teclado) {
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla. ");
        teclado.nextLine();
        teclado.nextLine();
        pcRandom = random.nextInt(100) + 1;
        int eleccionPc = pcRandom;
        listaNums.add(eleccionPc);

        String respuesta;
        do {
            System.out.printf("Pruebo con %d, ¿es mayor, menor o es el número (+/-/=)?%n", eleccionPc);
            respuesta = teclado.next();
            int index = listaNums.indexOf(eleccionPc);

            switch (respuesta) {
                case "+":
                    try {
                        eleccionPc = listaNums.get(index) + 1
                                + random.nextInt(listaNums.get(index + 1) - (listaNums.get(index) + 1));
                    } catch (IndexOutOfBoundsException iob) {
                        eleccionPc = eleccionPc + random.nextInt(101 - eleccionPc);
                    } catch (IllegalArgumentException ia) {
                        eleccionPc = listaNums.get(index) + 1
                                + random.nextInt(listaNums.get(index + 1) + 2 - (listaNums.get(index) + 1));
                    }
                    break;
                case "-":
                    try {
                        eleccionPc = listaNums.get(index - 1)
                                + random.nextInt(listaNums.get(index) - listaNums.get(index - 1));
                    } catch (IndexOutOfBoundsException e) {
                        eleccionPc = 1 + random.nextInt(listaNums.get(index) - 1);
                    } catch (IllegalArgumentException ia) {
                        eleccionPc = listaNums.get(index - 1)
                                + random.nextInt((listaNums.get(index) + 1) - listaNums.get(index - 1));
                    }
                    break;
                case "=":
                    System.out.println("Felicidades, ¡has acertado!");
                    break;
            }

            if (!listaNums.contains(eleccionPc)) {
                listaNums.add(eleccionPc);
            }
            Collections.sort(listaNums);
        } while (!respuesta.equals("="));
    }

}
