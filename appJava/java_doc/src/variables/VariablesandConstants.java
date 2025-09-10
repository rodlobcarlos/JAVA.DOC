package variables;

public class VariablesandConstants {

    /**
     * "Saber que son las variables,
     * la diferencia de tipos y
     * las constantes".
     */

    public static void main(String[] args) {

        // Variables

        String name = "Carlos"; // "El tipo "String" guarda cadenas de texto".
        System.out.println(name);
        name = "Rodríguez"; // "Aquí modifico la variable name anterior".
        System.out.println(name);
        // name = 20, java: incompatible types: int cannot be converted to java.lang.String ;

        int age = 20;
        System.out.println(age);

        /**
         * "Java con la palabra reservada "var",
         * es capaz de saber qué tipo de datos estamos usando".
         */
        var email = "carlos.dev@gmail.com"; // "Diferencia de tipos"
        System.out.println(email);
        var year = 2025;
        System.out.println(year);

        // Constants, buena práctica escribir en MAYUS para diferenciar las constantes.
        final String EMAIL = "rodlobcarlos@gmail.com"; // "Al añadir la palabra reservada "final" ya es una constante".
        System.out.println(EMAIL);

    }
}
