package ru.mirea.task7.part1;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return this.length;
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    public void setWidth(double side){
        this.length = side;
        this.width = side;
    }

    public void setLength(double side){
        this.width = side;
        this.length = side;
    }

    @Override
    public String toString() {
        return "Square with side " + this.length;
    }
}
