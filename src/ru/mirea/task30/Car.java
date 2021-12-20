package ru.mirea.task30;

import java.util.ArrayList;

public class Car {
    String brand;
    String name;
    double speed;
    ArrayList<Wheel> wheels;
    Driver driver;

    // Вложенный класс
    class Wheel{
        int radius;
        public Wheel(int radius) {
            this.radius = radius;
        }
    }

    static class Driver{
        String name;

        public Driver(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public Car(String brand, String name, double speed) {
        this.brand = brand;
        this.name = name;
        this.speed = speed;
        this.wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            wheels.add(new Wheel(13));
        }
    }

    public void beep(){
        System.out.print("Beeeep!");
    };

    public double calculateDistance(double time){
        return this.speed * time;
    }

    @Override
    public String toString() {
        return brand + " " + name + " has " + wheels.size() + " wheels, speed: " + speed + ", driver: " + driver.getName();
    }
}
