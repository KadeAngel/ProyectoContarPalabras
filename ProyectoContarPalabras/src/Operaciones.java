/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class Operaciones {
    /**
     * Cuenta el número de caracteres que tiene la frase introducida
     * por el usuario
     * @param cadena String con la frase que introduce el usuario
     * @return cantidadCaracteres (int con el numero de caracteres de la frase
     * introducida por el usuario)
     */
    static int contarCaracteresTotal(String cadena){
        //devuelve el número total de caracteres dada una determinada cadena
        int cantidadCaracteres = 0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                cantidadCaracteres++;
            }
        }
        return cantidadCaracteres;
    }
    
    /**
     * Cuenta el numero de palabras que contiene la frase introducida por
     * el usuario
     * @param cadena String con la frase que introduce el usuario
     * @return cantidadPalabras (int con el numero de palabras que contiene
     * la frase introducida por el usuario)
     */
    static int contarNumeroPalabras(String cadena){
        //cuenta el número de palabras introducido
        int cantidadPalabras = 1;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ' && cadena.charAt(i - 1) != ' ') {
                cantidadPalabras++;
            }
        }
        return cantidadPalabras;
        
    }
    
    /**
     * Cuenta el numero de caracteres de cada tipo que contiene la frase
     * introducida por el usuario
     * @param cadena String con la frase que introduce el usuario
     * @return contador (Array con la misma longitud que el array letras
     * y que contiene para cada posición, el numero de caracteres que contiene
     * la frase del caracter colocado en la misma posicion en el array "letras"
     */
    static int[] contarTodosCaracteres(String cadena){
        //devuelve la cantidad de caracteres de cada tipo
        InicioApp.letras = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '?',
            '¿', '!', '¡', ';', ':', '(', ')'};
        int[] contador = new int[37];
        for (int i = 0; i < cadena.length(); i++) {

            for (int j = 0; j < contador.length; j++) {
                if (cadena.charAt(i) == InicioApp.letras[j]) {
                    contador[j]++;
                }
            }
        }
        return contador;
        
    }
}
