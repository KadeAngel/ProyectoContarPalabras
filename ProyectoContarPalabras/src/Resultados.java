/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angel
 */
public class Resultados {
    /**
     * @param total valor que devuelve el método
     * Operaciones.contarCaracteresTotal()
     * @return Un String con la cantidad de caracteres total que posee la frase
     * introducida por el usuario, listo para imprimir por pantalla
     */
    static String textoCaracteresTotal (int total){
        
        return "Cantidad de caracteres: " + total;
    }
    
    /**
     * @param total valor que devuelve el método
     * Operaciones.contarNumeroPalabras()
     * @return Un String con la cantidad de palabras que posee la frase 
     * introducida por el usuario, listo para imprimir por pantalla
     */
    static String textoNumeroPalabras (int total){
        
        return "Cantidad de palabras: " + total;
    }
    
    /**
     * @param contador Array que devuelve el método
     * Operaciones.contarTodosCaracteres()
     * @return Un String con la cantidad de veces que sale cada caracter en
     * la frase introducida por el usuario, listo para imprimir por pantalla
     */
    static String textoTodosCaracteres (int[] contador){
        String resultado = "";
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 0 && InicioApp.letras[i] != ' ') {
                resultado += "Cantidad de " + InicioApp.letras[i] + ": " + contador[i] + "\n";
            }
        }
        return resultado;
    }
}
