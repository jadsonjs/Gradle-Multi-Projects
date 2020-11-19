package br.ufrn.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void sum() {
        Assert.assertEquals(10d, new Calculadora().sum(5, 5), 0.5d);
    }
}