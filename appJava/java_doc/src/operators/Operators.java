package operators;

public class Operators {

    /**
     * Tipos de operadores,
     * Asignación, comparación, lógicos y
     * unarios
     *
     */
    public static void main(String[] args) {

        // Operadores

        // Aritméticos
        var a = 5;
        var b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b); // "Módulo (Resto de la división)".

        // Asignación
        a = b;
        System.out.println(a);

        a = b * 3;
        System.out.println(a);

        a += 1; // "Al valor de a le sumo 1".
        System.out.println(a);

        a -= 1; // "Al valor de a le resta 1".
        System.out.println(a);

        // Comparación (relaciones)
        System.out.println(a == b); // "Igual que"
        System.out.println(a != b); // "Distinto que"
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println("-------------------------------------------");

        // Lógicos (Tabla de verdad)

        // Y (and)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(false && true);

        System.out.println("-----------------------------------");

        // O (or)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(false || true);

        System.out.println("-----------------------------------");

        // no (not)
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("-----------------------------------");

        // Unarios
        System.out.println(-b); // "convierte en negativo".
        System.out.println(+a); // "Convierte en positivo".
        System.out.println(--b); // "Resta uno".
        System.out.println(++a); // "Suma uno".
        System.out.println(a++); // "Suma uno para luego".
        System.out.println(b--); // "Resta para luego".

    }
}
