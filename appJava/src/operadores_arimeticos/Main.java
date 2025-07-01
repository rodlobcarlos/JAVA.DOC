package operadores_arimeticos;

public class Main {
    public static void main(String[] args) {
        int a = 2 + 2;
        int b = 2 - 1;
        int c = 4 * 3;
        int d = 4 % 3; // EL módulo te devuelve el resto de la división
        int e = 10 / 3; // División no exacta
        float e1_0 = 10 / 3; // Muestra el decimal de 0
        float e1_1 = 10f / 3f; // Muestra los decimales que tiene ese resto
        double e1_2 = 10.0 / 3.0; // Muestra más decimales

        int x = 7;
        int y = ++x; // Incrementa el valor de X y se lo asigna a Y

        int j = 7;
        int s = x++; // Asigna el valor de X a la Y, y luego lo incrementa

        /*
        Esta oparación vale igual para suma, resta, multiplicación y
        división;
         */
        int h = 5;
        h += 5; // Incrementa el valor de h en 5, es igual que hacer (h = h + 5)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(e1_0);
        System.out.println(e1_1);
        System.out.println(e1_2);
        System.out.println(x);
        System.out.println(y);
        System.out.println(j);
        System.out.println(s);
        System.out.println(h);

    }
}