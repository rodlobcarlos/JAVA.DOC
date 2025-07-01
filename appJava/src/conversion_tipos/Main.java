package conversion_tipos;

public class Main {
    public static void main(String[] args) {
        // Conversión implícita
        byte a = 1;
        int b = 15;
        int c = a + b;
        /*
        // Java está pasando del tipo de datos con menos bytes (byte)
        al tipo de dato con más byte en la operación que tengamos (int);
        (byte->short->int->long->float->double);
         */
        System.out.println(c);

        // Conversión explícita
        int x = 15;
        double y = 15.015;
        int z = (int) (x + y); // Indicamos que aunque devuelva un double, quiero que lo convierta a int
        System.out.println(z);

        /*
        Este metodo también sirve para el resto de tipos de datos.
        int -> Integer.parseInteger();
         */
        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j) + k; // Convertimos un String en un double con (Double.parseDouble())
        System.out.println(l);

    }
}