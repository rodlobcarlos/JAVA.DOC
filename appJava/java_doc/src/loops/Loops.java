package loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {

        // loops

        // for controlado por contador
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }

        String[] names = {"Carlos", "Manuel", "Carmen"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]); // "Imprime cada elemento de la lista".
        }

        // for-each
        for (String name : names) {
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Carlos", "rodlobcarlos@gmail.com");
        emails.put("Empresa", "empresamia@gmail.com");

        for (Map.Entry<String, String> email : emails.entrySet()) { // "entry.set() hace que los pares de valores sean un set de elementos porque tienen que ser únicos".
            System.out.println("Key ->: " + email.getKey());
            System.out.println("Value ->: " + email.getValue());
        }

        // while
        int i = 0;
        while (i < 5) {
            System.out.println("Hello world");
            i++; // "Cada vez que el bucle llegue a esta línea, el valor i incrementa uno".
        }

        i = 0;
        while (i < names.length) {
            System.out.println(names[i]);
            i++;
        }

        i = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[i]);
            if (names[i].equals("Manuel")) {
                find = true;
            }
            i++;
        }

        // do-while || "Aquí el código se ejecuta la primera vez si o si".
        i = 0;
        do {
            System.out.println("Hello world");
            i++;
        } while (i < 0);

        // Control de bucles

        // Break
        for (String name : names) {
            if (name.equals("Manuel")) {
                break;
            }
            System.out.println(name);
        }

        // Continue
        for (int index = 0; index < 5; index++) {
            if (index == 3) {
                continue;
            }
            System.out.println(index);
        }
    }

}
