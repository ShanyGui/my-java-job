package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExempleTest {
    @Test
    void exempleTest(){
        final int CHOSEN_NUMBER = 5;
        Exemple exemple = new Exemple(CHOSEN_NUMBER);
        assertEquals(CHOSEN_NUMBER,exemple.getNombre());
    }

}