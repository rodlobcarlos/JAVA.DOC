import java.util.ArrayList;

public class List {

    /**
     * "Es una estructura de datos que tiene una longitud no fija,
     * puede tanto crecer como decrecer y puedes eliminar datos de esta o
     * incluso la List entera. No pueden crearse listas de tipo de dato primitivo (Solo objetos)".
     *
     */

    public static void main(String[] args) {

        // Declaración y creación
        ArrayList<String> names = new ArrayList<>(); // "Primera forma".
        var numbers = new ArrayList<Integer>(); // "Segunda forma (Moderna)".

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Carlos");
        names.add("Marcos");
        System.out.println(names.size());

        // Acceder a los elementos
        System.out.println(names.get(1));
        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        // Modificar elementos
        names.set(1, "rodlobcarlos@gmail.com"); // "Modifico el valor 1 en la lista por otro que yo quiera".
        System.out.println(names);

        // Eliminar
        names.remove(1);
        System.out.println(names);

        // Buscar elementos
        System.out.println(names.contains("Carlos"));
        System.out.println(names.contains("rodlobcarlos@gmail.com")); // "Ya estaba eliminado".

    }
}
