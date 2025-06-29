package multiples_dimensiones;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // [][] Sirve para indicar que es un array de arrays (matriz), sino se pone da error
        int[][] numbers = {{0,1}, {2,3}}; // Esto es una matriz
        System.out.println(Arrays.deepToString(numbers));

        // En la parte derecha se muestra las columnas[3] y las filas[2]
        int[][] numbers2 = new int[3][2]; // Esto es una arrays que no se sabe los valores que tiene
        numbers2[0][0] = 5; // Valor en este caso de la columna 0 fila 0
        System.out.println(Arrays.deepToString(numbers2));

    }
}