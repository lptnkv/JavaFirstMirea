package ru.mirea.task3.part2;

public class Human {
    Head head;
    Hand left_hand, right_hand;
    Leg left_leg, right_leg;
    String name;
    int height;

    public Human(String name) {
        left_hand = new Hand();
        right_hand = new Hand();
        left_leg = new Leg();
        right_leg = new Leg();
        head = new Head();
        this.name = name;
        this.height = 170;
    }

    public Human(String name, int height) {
        left_hand = new Hand();
        right_hand = new Hand();
        left_leg = new Leg();
        right_leg = new Leg();
        head = new Head();
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor(){
        return this.head.getEyeColor();
    }

    public void setEyeColor(String color){
        this.head.setEyeColor(color);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return this.name + ", height: " + this.height + ", eye color: " + this.getEyeColor();
    }
}
