import org.junit.Test;

import static org.junit.Assert.*;


public class FuncionesTest {

    Funciones funciones = new Funciones();

    //---------factorial------------
    @Test
    public void factorialPositivo(){
        int result = funciones.factorial(4);
        assertEquals(24, result);
    }

    @Test
    public void factorialNegativo(){
        int result = funciones.factorial(-5);
        assertEquals(0, result);
    }

    @Test
    public void factorialUno(){
        int result = funciones.factorial(1);
        assertEquals(1, result);
    }

    @Test
    public void factorialCero(){
        int result = funciones.factorial(0);
        assertEquals(1, result);
    }
    //---------cuadradoPerfecto------------
    @Test
    public void cuadradoPerfectoPositivo(){
        boolean result = funciones.cuadradoPerfecto(17);
        assertTrue(result);
    }

    @Test
    public void noCuadradoPerfectoPositivo(){
        boolean result = funciones.cuadradoPerfecto(27);
        assertFalse(result);
    }

    @Test
    public void CuadradoPerfectoCero(){
        boolean result = funciones.cuadradoPerfecto(0);
        assertTrue(result);
    }

    @Test
    public void noCuadradoPerfectoNegativo(){
        boolean result = funciones.cuadradoPerfecto(-4);
        assertFalse(result);
    }

    //---------esNumeroDeFibonacci------------
    @Test
    public void esNumeroDeFibonacciCero(){
        boolean result = funciones.esNumeroDeFibonacci(0);
        assertTrue(result);
    }

    @Test
    public void esNumeroDeFibonacciPositivo(){
        boolean result = funciones.esNumeroDeFibonacci(34);
        assertTrue(result);
    }

    @Test
    public void noEsNumeroDeFibonacciPositivo(){
        boolean result = funciones.esNumeroDeFibonacci(41);
        assertFalse(result);
    }

    @Test
    public void noEsNumeroDeFibonacciNegativo(){
        boolean result = funciones.esNumeroDeFibonacci(-17);
        assertFalse(result);
    }
}
