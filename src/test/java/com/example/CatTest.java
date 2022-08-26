package com.example;

//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CatTest {

    private final Feline feline = new Feline();
    Cat cat = new Cat(feline);
//
//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }

    @Test
    public void getSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}