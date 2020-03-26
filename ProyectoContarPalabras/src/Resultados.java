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
    static String textoCaracteresTotal (int total){
        
        return "Cantidad de caracteres: " + total;
    }
    
    static String textoNumeroPalabras (int total){
        
        return "Cantidad de palabras: " + total;
    }
    
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
