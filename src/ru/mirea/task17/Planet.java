package ru.mirea.task17;

// Масса в 10^24 кг, диаметр в километрах
public enum Planet {
    Mercury(0.330,4879),
    Venus(4.87, 12104),
    Earth(5.97, 12756),
    Mars(0.642, 6792),
    Jupiter(1898, 142984),
    Saturn(568, 120536),
    Uranus(86.8, 51118),
    Neptune(102, 49528),
    Pluto(0.0146, 2370);

    private double mass;
    private double radius;

    Planet(double mass, double diameter) {
        this.mass = mass;
        this.radius = diameter / 2;
    }

    public double getMass() {
        return this.mass;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getGravity(){
        final double G = 6.674 * Math.pow(10, -11);
        double mass = this.mass * Math.pow(10, 24);
        double radius = this.radius * Math.pow(10, 3);

        return (G * mass) / (Math.pow(radius, 2));
    }

    public void printInfo(){
        System.out.println("Сила притяжения: " + this.getGravity() + " Н/кг");
    }
}
