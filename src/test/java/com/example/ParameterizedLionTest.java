package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {

    Feline feline = new Feline();

    private final String sex;
    private final boolean isHasMane;

    public ParameterizedLionTest(String sex, boolean isHasMane){
        this.sex = sex;
        this.isHasMane = isHasMane;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void shouldHaveMane() throws Exception {
        Lion lion = new Lion(feline, sex);
        assertEquals(isHasMane, lion.doesHaveMane());
    }
}