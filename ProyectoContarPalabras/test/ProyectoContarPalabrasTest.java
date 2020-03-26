/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author angel
 */
public class ProyectoContarPalabrasTest {
    
    /**
     * Comprueba el funcionamiento del método Operaciones.contarCaracteresTotal,
     * usando un par de assertEquals para comprobar que coinciden el numero que
     * introduzco, con el numero de caracteres del String que paso al método
     */
    @Test
    public void contarCacteresTotalTest() {
        assertEquals(10, Operaciones.contarCaracteresTotal("hola que tal"));
        assertEquals(3, Operaciones.contarCaracteresTotal("hol"));
    }
    
    /**
     *Comprueba el funcionamiento del método Operaciones.contarNumeroPalabras,
     * usando un par de assertEquals que comprobarán que coincide el número
     * introducido con el número de palabras del String que le paso al método.
     * En el segundo assertEquals compruebo que poniendo dos espacios entre
     * palabras también lo cuenta bien
     */
    @Test
    public void contarNumeroPalabrasTest() {
        assertEquals(1, Operaciones.contarNumeroPalabras("hola"));
        assertEquals(3, Operaciones.contarNumeroPalabras("hola que  tal"));
    }
    
    /**
     * Comprueba el funcionamiento del método Operaciones.contarTodosCaracteres,
     * creando un array pararelo a InicioApp.letras en el cual pongo un 1
     * para la h, la o, la l y la a y compruebo que funciona para el String hola.
     * De esta forma simulo lo que devolvería este metodo para ese String.
     */
    @Test
    public void contarTodosCaracteresTest() {
        int[] arrayHola = new int[]{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Assert.assertArrayEquals(arrayHola, Operaciones.contarTodosCaracteres("hola"));
    }
    
    /**
     * Comprueba el funcionamiento del método Resultados.textoCaracteresTotal,
     * escribiendo lo que debería devolver el método con el valor de total = 5
     */
    @Test
    public void textoCaracteresTotalTest() {
        assertEquals("Cantidad de caracteres: " + 5, Resultados.textoCaracteresTotal(5));
    }
    
    /**
     * Comprueba el funcionamiento del método Resultados.textoNumeroPalabras,
     * escribiendo lo que debería devolver el método con el valor de total = 1
     */
    @Test
    public void textoNumeroPalabrasTest() {
        assertEquals("Cantidad de palabras: " + 1, Resultados.textoNumeroPalabras(1));
    }
    
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
