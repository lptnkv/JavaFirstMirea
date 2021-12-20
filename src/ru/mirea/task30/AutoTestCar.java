package ru.mirea.task30;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class AutoTestCar {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testDistance(){
        Car car1 = new Car("Tesla", "Model s", 100);
        ArrayList<Double> expected = new ArrayList<Double>();
        expected.add(200d);
        expected.add(340d);

        ArrayList<Double> actual = new ArrayList<Double>();
        actual.add(car1.calculateDistance(2));
        actual.add(car1.calculateDistance(3.4));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBeep1(){
        Car car = new Car("Vaz", "2106", 45){
            @Override
            public void beep() {
                System.out.print("Honk!");
            }
        };
        car.beep();
        Assert.assertEquals("Honk!", outContent.toString());
    }

    @Test
    public void testBeep2(){
        Car car = new Car("Tesla", "Model s", 100);
        car.beep();
        Assert.assertEquals("Beeeep!", outContent.toString());
    }

    @Test
    public void testToString(){
        Car car = new Car("Tesla", "Model s", 100);
        car.driver = new Car.Driver("John");
        String expected = "Tesla Model s has 4 wheels, speed: 100.0, driver: John";
        String actual = car.toString();
        Assert.assertEquals(expected, actual);
    }
}
