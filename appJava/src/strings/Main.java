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
        System.out.println(text3.trim()); // El metodo trim() muestra el String sin espacios delante y atrás-0
        System.out.println(text3);

        /*
        Para poder escapar un caracter, usamos esta sintaxis
        la cual usa comillas dobles para encerrar el caracter que queramos escapar y
        luego las barras invertidas a los lados de este encierre;
         */
        String text4 = "Esto es un \"String\"";
        System.out.println(text4);

        // También se pueden escapar esas barras invertidas
        String text5 = "C:\\Esto es un \"String\">"; // Esto es un ejemplo de un directorio de Windows donde escapamos las barras invertidas
        System.out.println(text5);

        /*
        Para un salto de línea se usa \n, para una tabulación se usa \t;
         */
        String text6 = "Esto es \nun Salto de línea"; // Salto de línea
        System.out.println(text6);
        String text7 = "\tEsto es una tabulacion"; // Esto es una tabulación
        System.out.println(text7);

    }
}