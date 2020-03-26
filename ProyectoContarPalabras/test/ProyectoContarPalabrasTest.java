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
    
    @Test
    public void contarCacteresTotalTest() {
        assertEquals(10, Operaciones.contarCaracteresTotal("hola que tal"));
        assertEquals(3, Operaciones.contarCaracteresTotal("hol"));
    }
    
    @Test
    public void contarNumeroPalabrasTest() {
        assertEquals(1, Operaciones.contarNumeroPalabras("hola"));
        assertEquals(3, Operaciones.contarNumeroPalabras("hola que  tal"));
    }
    
    @Test
    public void contarTodosCaracteresTest() {
        int[] arrayHola = new int[]{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        Assert.assertArrayEquals(arrayHola, Operaciones.contarTodosCaracteres("hola"));
    }
    
    @Test
    public void textoCaracteresTotalTest() {
        assertEquals("Cantidad de caracteres: " + 5, Resultados.textoCaracteresTotal(5));
    }
    
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
