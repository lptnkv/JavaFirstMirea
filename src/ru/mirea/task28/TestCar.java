package ru.mirea.task28;

public class TestCar {
    public static void main(String[] args) {
        Car testCar1 = new Car("Tesla", "Model s", 100){
            @Override
            public void beep() {
                System.out.println("Honk!");
            }
        };
        testCar1.driver = new Car.Driver("John");
        testCar1.beep();
        System.out.println(testCar1);

        Car testCar2 = new Car("Vaz", "2109", 50){
            @Override
            public void beep() {
                System.out.println("Wroom!");
            }
        };
        testCar2.driver = new Car.Driver("Ivan");
        testCar2.beep();
        System.out.println(testCar2);

    }
}
