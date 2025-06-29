package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[3];// Inicializamos una array con la palabra reservada "new"
        // System.out.println(numbers); // Esto imprime la zona de memoria

        // Aquí estoy añadiendo valores a la array
        numbers[0] = 5;
        numbers[2] = 7;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length); // Longitud de la array
        Arrays.sort(numbers); // Ordena la array de menor a mayor
        System.out.println(Arrays.toString(numbers));

        int[] numbers2_0 = {0,1,2}; // Otra forma de crear una array
        numbers2_0[0] = 5;
        numbers2_0[2] = 7;
        System.out.println(Arrays.toString(numbers2_0));

    }
}