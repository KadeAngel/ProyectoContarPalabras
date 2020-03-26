import java.util.Scanner;

public class InicioApp {

    public static Scanner sc = new Scanner(System.in);

    static char[] letras;

    public static void main(String[] args) {

        System.out.println("------- Ejercicio cadena caracteres Array -------");

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        String cadena = frase.toLowerCase();//frase pero en minúsculas.

        System.out.println(Resultados.textoCaracteresTotal(Operaciones.contarCaracteresTotal(cadena)));
        System.out.println(Resultados.textoNumeroPalabras(Operaciones.contarNumeroPalabras(cadena)));
        System.out.println(Resultados.textoTodosCaracteres(Operaciones.contarTodosCaracteres(cadena)));

    }
}