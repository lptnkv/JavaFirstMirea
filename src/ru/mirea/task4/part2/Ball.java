package ru.mirea.task4.part2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball() {
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "ball at: (" + this.x + ", " + this.y + ")";
    }
}
