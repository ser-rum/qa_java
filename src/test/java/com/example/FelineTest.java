package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void shouldBeCatFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void shouldBeMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void shouldBeOneKitten() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void shouldBeFiveKitten() {
        assertEquals(5, feline.getKittens(5));
    }
}