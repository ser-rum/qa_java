package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    private final Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void shouldBeMeowSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void shouldBeMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}