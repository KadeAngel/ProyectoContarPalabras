import java.util.Scanner;

public class InicioApp {

    public static Scanner sc = new Scanner(System.in);

    static char[] letras;

    public static void main(String[] args) {

        System.out.println("------- Ejercicio cadena caracteres Array -------");

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        String cadena = frase.toLowerCase();//frase pero en minúsculas.

        System.out.println(textoCaracteresTotal(Operaciones.contarCaracteresTotal(cadena)));
        System.out.println(textoNumeroPalabras(Operaciones.contarNumeroPalabras(cadena)));
        System.out.println(textoTodosCaracteres(Operaciones.contarTodosCaracteres(cadena)));

    }
    
    static String textoCaracteresTotal (int total){
        
        return "Cantidad de caracteres: " + total;
    }
    
    static String textoNumeroPalabras (int total){
        
        return "Cantidad de palabras: " + total;
    }
    
    static String textoTodosCaracteres (int[] contador){
        String resultado = "";
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 0 && letras[i] != ' ') {
                resultado += "Cantidad de " + letras[i] + ": " + contador[i] + "\n";
            }
        }
        return resultado;
    }
}