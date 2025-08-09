public class Datatypes {
    public static void main(String[] args) {

        // Tipos de datos primitivos

        int myInt = 7; // "Imprime un dato entero (sin decimales)".
        System.out.println(myInt);

        double myDouble = 4.56; // "Imprime un dato decimal".
        System.out.println(myDouble);

        char myChar = 'a'; // "Imprime un solo caracter".
        System.out.println(myChar);

        boolean myBoolean = true; // "Imprime true or false".
        System.out.println(myBoolean);

        // Exercises
        // 1. "Declara una variable de tipo String y asígnale tu nombre".
        String name = "Carlos";
        System.out.println(name);

        // 2. "Crea una variable de tipo int y asígnale tu edad".
        int age = 20;
        System.out.println(age);

        // 3. "Crea una variable de tipo double con tu altura en metros".
        double height = 1.78;
        System.out.println(height);

        // 4. "Declara una variable de tipo boolean que indique si te gusta programar".
        boolean meGustaProgramar = true;
        System.out.println(meGustaProgramar);

        // 5. "Declara una costante con tu email".
        final String EMAIL = "rodlobcarlos@gmail.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'C';
        System.out.println(initial);

        // 7. "Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla".
        String locality = "Alcalá del río";
        System.out.println(locality);
        locality = "Sevilla";
        System.out.println(locality);

        // 8. "Crea una variable int llamada a, otra b, e imprime la suma de ambas".
        int a = 5;
        int b = 7;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(EMAIL.getClass().getSimpleName());
        System.out.println(name.getClass().getSimpleName());
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        //c = 65; "cannot find symbol variable c";

    }
}
