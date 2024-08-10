import java.util.Scanner;
public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //Clase Scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        //Asignaciones y declaraciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //ARREGLOS:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Este bucle hace que se escriban los guiones bajos dentro de cada posicion del bucle letrasAdivinadas
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while(!palabraAdivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar: "+String.valueOf(letrasAdivinadas));

            System.out.println("Introduce una letra porfavor: ");

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for(int i = 0;i<palabraSecreta.length();i++){
                if (palabraSecreta.charAt(i) == letra){                   //charAt sirve para recorrer strings
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡incorrecto!, Te quedan "+(intentosMaximos-intentos)+" intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta: "+ palabraSecreta);
            }
        }

        if(!palabraAdivinada){
            System.out.println("!Que pena te has quedado sin intentos¡");
        }

        scanner.close();

        /*                                            ---------charAt------------
         * este metodo sirve para devolver una letra de un String especificada por ejemplo si tenemos una variable String x = "hola";
         * y usamos el metodo charAt asi, x.charAt(0), le estamos diciendo que va a devolver el valor que está en la posición 0 osea h
         * ahora si le cambiamos el 0 a 1 nos va a devolver el que está en la posicion 1 que seria "o" su definicion es:
         * El método devuelve el carácter en el índice definido de una cadena .
         */
    }
}
