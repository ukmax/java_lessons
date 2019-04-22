package ru.java_lessons.sandbox;

import org.testng.annotations.Test;

public class MyFirstProgramTest {

    @Test
    public void FirstTest(){
        assert 99 == 99;
    }

    @Test
    public void SecondTest(){
        assert false;
    }
}
