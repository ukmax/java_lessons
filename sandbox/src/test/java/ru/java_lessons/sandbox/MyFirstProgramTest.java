package ru.java_lessons.sandbox;

import org.testng.annotations.Test;

public class MyFirstProgramTest {

    @Test
    public void FirstTest(){
        assert true;
    }

    @Test
    public void SecondTest(){
        assert false;
    }
}
