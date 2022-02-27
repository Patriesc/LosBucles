package ejerciciost4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio5 extends Ejercicio4 {

    private String respuesta;
    private int eleccionPc;
    ArrayList<Integer> listaNums = new ArrayList<>();
    int index;

    public void ahoraYo(Scanner teclado) {
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla. ");
        teclado.nextLine();
        pcRandom = random.nextInt(100) + 1;
        eleccionPc = pcRandom;
        listaNums.add(eleccionPc);

        System.out.println(String.format("Pruebo con %d, ¿es mayor, menor o es el número (+/-/=)?", eleccionPc));
        respuesta = teclado.next();
        if (respuesta.equals("+")) {
            eleccionPc = eleccionPc + random.nextInt(101 - eleccionPc);
        } else if (respuesta.equals("-")) {
            eleccionPc = 1 + random.nextInt(eleccionPc - 1);
        } else if (respuesta.equals("=")) {
            System.out.println("Felicidades, ¡has acertado!");
        }
        listaNums.add(eleccionPc);
        Collections.sort(listaNums);

        while (!respuesta.equals("=")) {
            System.out.printf("Pruebo con %d, ¿es mayor, menor o es el número (+/-/=)?%n", eleccionPc);
            respuesta = teclado.next();
            index = listaNums.indexOf(eleccionPc);
            if (respuesta.equals("+")) {
                try {
                    eleccionPc = listaNums.get(index) + random.nextInt(listaNums.get(index + 1) - listaNums.get(index));
                } catch (IndexOutOfBoundsException e) {
                    eleccionPc = eleccionPc + random.nextInt(101 - eleccionPc);
                  //  eleccionPc = listaNums.get(index) + random.nextInt(101 - listaNums.get(index));
                } catch (IllegalArgumentException ia){
                    eleccionPc = eleccionPc + random.nextInt(101 - eleccionPc);
                }
            } else if (respuesta.equals("-")) {
                try {
                    eleccionPc = listaNums.get(index - 1) + random.nextInt(listaNums.get(index) - listaNums.get(index - 1));
                } catch (IndexOutOfBoundsException e) {
                    eleccionPc = 1 + random.nextInt(listaNums.get(index) - 1);
                } 
            } else if (respuesta.equals("=")) {
                System.out.println("Felicidades, ¡has acertado!");
            }
            listaNums.add(eleccionPc);
            Collections.sort(listaNums);
        }
    }

}
