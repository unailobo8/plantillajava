package test;

import app.*;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.*;

public class Test {

    @Test
    @DisplayName("Validamos que el metodo1 es correcto")
    void metodo1() {
        Metodos met = new Metodos();
        String resultado = met.metodo1(6);
        assertEquals(" Face ", resultado);
    }


    @Test
    @DisplayName("Validamos que el metodo2 es correcto")
    void metodo2(){
        Metodos met = new Metodos();
        String resultado = met.metodo2(new int[]{1,2,3});
        assertEquals("12 Face ", resultado);
    }
}