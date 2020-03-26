import java.util.Scanner;

public class InicioApp {

    public static Scanner sc = new Scanner(System.in);
    
    public static String cadena;

    static char[] letras;

    public static void main(String[] args) {

        menu();

        operacionesResultados();
    }
    
    static void menu () {
        System.out.println("------- Ejercicio cadena caracteres Array -------");

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        cadena = frase.toLowerCase();//frase pero en minúsculas.
    }
    
    static void operacionesResultados(){
        System.out.println(Resultados.textoCaracteresTotal(Operaciones.contarCaracteresTotal(cadena)));
        System.out.println(Resultados.textoNumeroPalabras(Operaciones.contarNumeroPalabras(cadena)));
        System.out.println(Resultados.textoTodosCaracteres(Operaciones.contarTodosCaracteres(cadena)));
    }
    
}