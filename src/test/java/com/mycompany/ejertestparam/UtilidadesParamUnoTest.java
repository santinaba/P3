package com.mycompany.ejertestparam;

import com.mycompany.ejertestparam.Utilidades;
import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class UtilidadesParamUnoTest {

    @Parameters
    //devolvera un array de objetos --> coleccion
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {1, 2}, {3, 5}, {0, 4}, {1, 3}
        });
    }
    private final int v1;
    private final int v2;
    private final Utilidades utils = new Utilidades();
    private final Calculadora calculadora = new Calculadora();
    private final Fibonacci fibo = new Fibonacci();
    private final Palindromo palin = new Palindromo();
    private final NumeroPrimo prim = new NumeroPrimo();

    public UtilidadesParamUnoTest(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Test
    public void testSumaNumeros() {
        System.out.println("los parametros son v1=" + v1 + " v2=" + v2);
        int resultado = utils.sumaNumeros(v1, v2);
        assertEquals(v1 + v2, resultado);
    }

    @Test
    public void testSuma() {
        System.out.println("los parametros son v1=" + v1 + " v2=" + v2);
        int resultado = calculadora.suma(v1, v2);
        assertEquals(v1 + v2, resultado);
    }

    @Test
    public void testResta() {
        System.out.println("los parametros son v1=" + v1 + " v2=" + v2);
        int resultado = calculadora.resta(v1, v2);
        assertEquals(v1 - v2, resultado);
    }

    @Test
    public void testMultiplicacion() {
        System.out.println("los parametros son v1=" + v1 + " v2=" + v2);
        int resultado = calculadora.multiplicacion(v1, v2);
        assertEquals(v1 * v2, resultado);
    }

    @Test
    public void testDivision() {
        System.out.println("los parametros son v1=" + v1 + " v2=" + v2);
        int resultado = calculadora.division(v1, v2);
        assertEquals(v1 / v2, resultado);
    }
    
}
