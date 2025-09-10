package structures;

import java.util.HashMap;

    /**
    * Es una estructura que no guarda los datos ordenados (Hash).
     * 9*/
public class Maps {
    public static void main(String[] args) {

        // Declaración y creación
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño
        System.out.println(names);

        // Añadir elementos
        names.put("Carlos", "rodlobcarlos@gmail.com");
        names.put("Carlitos", "hello world");
        names.put("CRL", "crodlob@gmail.com");
        System.out.println(names);

        // Acceder a los elementos
        System.out.println(names.get("Carlos")); // Nos retorna la clave
        System.out.println(names.get("Dev")); // Retorna null si no existe

        // Verificar
        System.out.println(names.containsKey("Carlos"));
        System.out.println(names.containsKey("Dev"));

        // Eliminar elementos
        System.out.println(names.remove("Carlos"));
        System.out.println(names.remove("Carlitos"));
        System.out.println(names);

        // Modificación de elementos
        names.put("Carlos", "rodlobcarlos@gmail.com");
        System.out.println(names);

        names.put("Carlos", "crodlob@gmail.com");
        System.out.println(names);

        // Otras operaciones
        System.out.println(names.isEmpty()); // Comprueba si esta vacío
        var values = names.values();
        System.out.println(values);

    }
}
