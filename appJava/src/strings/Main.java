package strings;

public class Main {
    public static void main(String[] args) {
        String text1 = "Esto es un String"; // Esto es una cadena de texto

        int size = text1.length(); // Este metodo length() cuanta la longitud del texto (retorna int)
        System.out.println(size);

        // Este metodo replace, remplaza el texto que quieras del text1 por otro en text2
        String text2 = text1.replace("Esto es ", "Aquí tenemos ");
        System.out.println(text2);

        /*
        Text2 es un String completamente distinto a text1, por ello
        imprimirá la cadena de texto de text1 sin cambios;
         */
        System.out.println(text1); // Los String son inmutables

        System.out.println(text2.endsWith("ing")); // La cadena termina por "ing"
        System.out.println(text2.startsWith("ing")); // La cadena no empieza por "ing"
        System.out.println(text2.contains("Esto")); // La cadena contiene "Esto"
        System.out.println(text2.indexOf("Str")); // Muestra en que posición de la cadena empieza el texto dado (0->...)
        System.out.println(text2.toLowerCase()); // Pasa el texto a minúscula
        System.out.println(text2.toUpperCase()); // Pasa el texto a mayúscula

        String text3 = "   Esto es un String nuevo     ";
        System.out.println(text3.trim()); // El metodo trim() muestra el String sin espacios delante y atrás
        System.out.println(text3);
    }
}