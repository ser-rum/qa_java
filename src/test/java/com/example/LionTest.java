package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    @Mock
    Feline feline;// = new Feline();

    private final String sex;
    private final boolean isHasMane;

    public LionTest(String sex, boolean isHasMane){
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

    @Test(expected = java.lang.Exception.class)
    public void shouldBeException() throws Exception {
        Lion lion = new Lion(feline, "");
        lion.doesHaveMane();
    }

    @Test
    public void shouldBeOneKitten() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(100);
        assertEquals(100, lion.getKittens());
        //assertEquals(1, lion.getKittens());
    }

    @Test
    public void shouldBeMeat() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Палтус","Эклер","Брокколи"));
        assertEquals(List.of("Палтус","Эклер","Брокколи"), lion.getFood());
        //assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}