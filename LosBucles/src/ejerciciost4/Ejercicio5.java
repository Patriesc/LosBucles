package ejerciciost4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 extends Ejercicio4 {

    private String respuesta;
    private int eleccionPc;
    private ArrayList<Integer> listaNums = new ArrayList<>();
    private int index;

    public void ahoraYo(Scanner teclado) {
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla. ");
        teclado.nextLine();
        teclado.nextLine();
        pcRandom = random.nextInt(100) + 1;
        eleccionPc = pcRandom;
        listaNums.add(eleccionPc);

        do {
            System.out.println(String.format("Pruebo con %d, ¿es mayor, menor o es el número (+/-/=)?", eleccionPc));
            respuesta = teclado.next();
            index = listaNums.indexOf(eleccionPc);

            if (respuesta.equals("+")) {
                try {
                    eleccionPc = listaNums.get(index) + 1
                            + random.nextInt(listaNums.get(index + 1) - (listaNums.get(index) + 1));
                } catch (IndexOutOfBoundsException iob) {
                    eleccionPc = eleccionPc + random.nextInt(101 - eleccionPc);
                } catch (IllegalArgumentException ia) {
                    eleccionPc = listaNums.get(index) + 1
                            + random.nextInt(listaNums.get(index + 1) + 2 - (listaNums.get(index) + 1));
                }
            } else if (respuesta.equals("-")) {
                try {
                    eleccionPc = listaNums.get(index - 1)
                            + random.nextInt(listaNums.get(index) - listaNums.get(index - 1));
                } catch (IndexOutOfBoundsException e) {
                    eleccionPc = 1 + random.nextInt(listaNums.get(index) - 1);
                } catch (IllegalArgumentException ia) {
                    eleccionPc = listaNums.get(index - 1)
                            + random.nextInt((listaNums.get(index) + 1) - listaNums.get(index - 1));
                }
            } else if (respuesta.equals("=")) {
                System.out.println("Felicidades, ¡has acertado!");
            }

            if (!listaNums.contains(eleccionPc)) {
                listaNums.add(eleccionPc);
            }
            Collections.sort(listaNums);
        } while (!respuesta.equals("="));
    }

}
