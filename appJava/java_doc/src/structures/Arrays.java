package structures;

public class Arrays {

    /**
     * "Es una estructura de datos que tiene una longitud limitada,
     * se guardan los datos en el orden que tú los insertes, puedes modificar esos datos
     * péro no puedes borrarlos".
     *
     */

    public static void main(String[] args) {

        // Declaración y creación
        int[] number = new int[3];
        System.out.println(number.length);
        System.out.println(number);

        // Acceso
        String [] names = {"Carlos", "Manuel", "Carmen"};
        System.out.println(names[2]); // "Accedes al dato seleccionado".
        System.out.println((new String[2])[1]); // "NULL"
        System.out.println(number[2]);

        // Modificación
        number[0] = 3;
        System.out.println(number[0]); // "He modificado el valor en la posición 0".
        // number[3] = 10; "Esto es un error ya que sale de la longitud de la Array".

    }
}
