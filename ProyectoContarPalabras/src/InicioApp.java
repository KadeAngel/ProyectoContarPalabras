import java.util.Scanner;

/**
 *
 * @author angel
 */
public class InicioApp {

    /**
     * Creacion de un objeto de la clase Scanner que permite pedir datos al
     * usuario
     */
    public static Scanner sc = new Scanner(System.in);
    
    /**
     *
     */
    public static String cadena;

    static char[] letras;

    /**
     * Metodo main, en el cual ejecuto todo el programa
     * @param args
     */
    public static void main(String[] args) {

        menu();

        operacionesResultados();
    }
    
    /**
     * Metodo en el que recibo la frase introducida por el usuario
     */
    static void menu () {
        System.out.println("------- Ejercicio cadena caracteres Array -------");

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        cadena = frase.toLowerCase();//frase pero en minúsculas.
    }
    
    /**
     * Metodo que recoge la ejecucion de todos los metodos del proyecto
     */
    static void operacionesResultados(){
        System.out.println(Resultados.textoCaracteresTotal(Operaciones.contarCaracteresTotal(cadena)));
        System.out.println(Resultados.textoNumeroPalabras(Operaciones.contarNumeroPalabras(cadena)));
        System.out.println(Resultados.textoTodosCaracteres(Operaciones.contarTodosCaracteres(cadena)));
    }
    
}