package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class NotParameterizedLionTest {

    Feline feline = new Feline();

    @Test
    public void shouldBeOneKitten() {
        Lion lion = new Lion(feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void shouldBeMeat() throws Exception {
        Lion lion = new Lion(feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test//(expected = java.lang.Exception.class)
    public void shouldBeException() {
        Exception e = assertThrows(
                Exception.class, () -> {
                    Lion lion = new Lion(feline, "");
                    lion.doesHaveMane();
                });
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expected, e.getMessage());
    }
}
