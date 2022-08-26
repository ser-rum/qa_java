package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public LionTest(String sex){
        this.sex = sex;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][] {
                { "Самец", },
                { "Самка", },
        };
    }

    @Test
    public void getKittens() {
    }

    @Test
    public void doesHaveMane() {
    }

    @Test
    public void getFood() {
        Feline feline = new Feline();
    }
}