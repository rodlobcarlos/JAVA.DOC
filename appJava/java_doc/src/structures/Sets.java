package structures;

import java.util.HashSet;

public class Sets {

    /**
     * "Es una estructura que no permite duplicados,
     * guarda los elementos sin ordenar. Para buscar elementos
     * es más útil porque que no están ordenados los datos".
     *
     */
    public static void main(String[] args) {

        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();
        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Carlos");
        names.add("Marcos");
        names.add("Carlitos");
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);


        // Eliminar
        names.remove("Carlos");
        System.out.println(names);

        // Buscar elementos
        System.out.println(names.contains("Carlos"));
        System.out.println(names.contains("rodlobcarlos@gmail.com"));

        names.add("Carlitos");
        names.add("Carlitos");
        System.out.println(names);

        // Conjuntos

        //names.addAll(numbers); "Error por incompatibilidad de datos".

        var countries = new HashSet<String>();
        countries.add("Spain");
        countries.add("France");
        names.addAll(countries); // "Uno el Set countrie al Set de names".
        System.out.println(names);

    }
}
