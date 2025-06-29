package constantes;

public class Main {
    public static void main(String[] args) {
        /*
        La palabra reservada final indica que la variable a la que se aplica,
        no puede cambiar su valor (es constante);
         */
        final String empresa = "Hola mundo limited"; // empresa es constante
        //empresa = "Hola mundo"; // No puede cambiar porque es constante
        System.out.println(empresa);

    }
}