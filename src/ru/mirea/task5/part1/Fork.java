package ru.mirea.task5.part1;

public class Fork extends Dish{
    // число зубцов
    public int tines;

    public Fork(String material, int tines) {
        super(material);
        this.tines = tines;
    }

    public Fork(String material) {
        super(material);
        this.tines = 4;
    }

    public Fork(){
        super("Steel");
        this.tines = 4;
    }

    public int getTines() {
        return tines;
    }

    public void setTines(int tines) {
        this.tines = tines;
    }

    @Override
    void smash() {
        System.out.println("You cannot break fork");
    }

    @Override
    public String toString() {
        return this.material + " fork with " + this.tines + " tines";
    }
}
