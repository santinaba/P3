/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NumeroPrimoTest {
    @Parameterized.Parameters
    //devolvera un array de objetos --> coleccion
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {1, 5, 6, 7}});
    }
    private final NumeroPrimo numprim = new NumeroPrimo();
    private final int v1;
    
    
    public NumeroPrimoTest(int v1, int v2) {
        this.v1 = v1;
    }

    
    
}