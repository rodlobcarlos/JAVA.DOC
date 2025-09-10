package conditionals;

public class Conditionals {

    /**
     * Diferentes usos de condicionales y
     * algunos ejercicios para prácticar.
     *
     */
    public static void main(String[] args) {

        // Condicionales

        // Sentencia if

        var age = 18;

        System.out.println(age >= 18); // "Retorna (true or false)".

        if(age > 18) {
            System.out.println("El usuario es mayor de edad.");
        } else if (age == 18) {
            System.out.println("El usuario tiene justo 18 años.");
        }
        else {
            System.out.println("El usuario es menor de edad.");
        }

        // Sentencia switch

        var day = 1;

        switch (day) {
            case 1:
                System.out.println("Es Lunes.");
                break;
            case 2:
                System.out.println("Es Martes.");
                break;
            case 3:
                System.out.println("Es Miércoles.");
                break;
            default:
                System.out.println("No es ni lunes, ni martes, ni miércoles");
        }
        System.out.println("------------------------------");

        // Exercises

        // 1. "Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18)."
            var age_user = 19;
            System.out.println(age_user >= 18);

            if (age_user > 18) {
                System.out.println("El usuario puede votar.");
            } else if (age_user == 18) {
                System.out.println("El usuario justo tiene 18 años, puede votar.");
            } else {
                System.out.println("El usuario no puede votar.");
            }

        // 2. "Declara dos números y muestra cuál es mayor, o si son iguales."
            var num_1 = 10;
            var num_2 = 9;

            if (num_1 > num_2) {
                System.out.println(num_1 + " Es mayor que " + num_2);
            } else if (num_1 < num_2) {
                System.out.println(num_2 + " Es mayor que " + num_1);
            } else {
                System.out.println(num_1 + " Es igual que " + num_2);
            }

        // 3. "Dado un número, verifica si es positivo, negativo o cero."
            var num = 0;
            if (num > 0) {
                System.out.println(num + " Es positivo.");
            } else if (num < 0) {
                System.out.println(num + " Es negativo.");
            } else {
                System.out.println(num + " Es cero");
            }

        // 4. "Crea un programa que diga si un número es par o impar."
            var test = 6;

            if (test % 2 == 0) {
                System.out.println(test + " Es un número par.");
            } else {
                System.out.println(test + " Es un número impar.");
            }

        // 5. "Verifica si un número está en el rango de 1 o 100."
            var range = 65;

            if (range >= 1 && range <= 100) {
                System.out.println(range + " Esta en el rango del (1-100)");
            } else {
                System.out.println(range + " No está en el rango del (1-100)");
            }

        // 6. "Declara una variable con el día de la semana (1-7) y muestra su nombre con switch."
            var week_day = 5;

            switch (week_day) {
                case 1:
                    System.out.println("Es lunes.");
                    break;
                case 2:
                    System.out.println("Es martes.");
                    break;
                case 3:
                    System.out.println("Es miércoles.");
                    break;
                case 4:
                    System.out.println("Es jueves.");
                    break;
                case 5:
                    System.out.println("Es viernes.");
                    break;
                case 6:
                    System.out.println("Es sábado.");
                    break;
                case 7:
                    System.out.println("Es domingo.");
                    break;
            }

        // 7. "Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100)."
            var note = 86;

            if (note >= 90 && note <=100) {
                System.out.println("Sobresaliente.");
            } else if (note >= 50 && note <= 89) {
                System.out.println("Aprobado.");
            } else if (note >= 0 && note <= 49) {
                System.out.println("Suspenso.");
            }

        // 9. "Crea un programa que diga si una letra es vocal o consonante (char)."
            char leter = 'l';

            if (leter == 'a' || leter == 'e' ||  leter == 'i' ||  leter == 'o' ||  leter == 'u') {
                System.out.println(leter + " Es una vocal.");
            } else {
                System.out.println(leter + " Es una consonante.");
            }

        // 10. "Usa tres variables a, b, c y muestra cuál es el mayor de los tres."
            var a = 10;
            var b = 20;
            var c = 3;

            if (a > b && a > c) {
                System.out.println(a + " Es la mayor.");
            } else if (b > a && b > c) {
                System.out.println(b + " Es la mayor.");
            } else {
                System.out.println(c + " Es el mayor.");
            }
    }
}
