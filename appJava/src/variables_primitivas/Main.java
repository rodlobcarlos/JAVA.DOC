package variables_primitivas;

public class Main {
    public static void main(String[] args) {
        /*
        Mientras más grande sea la capacidad de almacenaje,
        más memoria consume nuestra app a la hora de cargar estos datos;
        Estos tipos de datos solo son válidos para números enteros;
         */
        byte num1 = 50; // El byte almacena del -128->127
        int num2 = 3; // El int almacena del -2mm->2mm
        short num3 = 20455; // El short almacena del -32768->32767
        long num4 = 15600500; // El long almacena del -9...0->16 // 9...0->16

        System.out.println(num1 + " -> BYTE");
        System.out.println(num2 + " -> INT");
        System.out.println(num3 + " -> SHORT");
        System.out.println(num4 + " -> LONG");

        /*
        A la hora de operar con estos datos hay que tener en cuenta,
        que mientras menos dígitos menos margen de error tenemos a la hora de procesar cálculos;
         */
        float decimal_num1 = 15f; // El float almacena unos 7 decimales
        double decimal_num2 = 15.5; // El double almacena unos 15 decimales

        System.out.println(decimal_num1 + "-> Número flotante");
        System.out.println(decimal_num2 + "-> Número doble");

        /*
        Boolean es un tipo de dato que solo devuelve (true) o (false),
        a la hora por ejemplo de estar controlando una condición es nuestro código.
         */
        boolean isActive = true; // Devuelve cierto (true)
        boolean notActive = false; // Devuelve falso (false)
        System.out.println(isActive);
        System.out.println(notActive);

        /*
        Los caracteres solo almacenan una unica letra y se tiene que utilizar
        usando las comillas simples únicamente;
         */
        char character = 'a'; // Los caracteres se usan con comillas simples('a') no dobles("a")
        System.out.println(character);
    }
}