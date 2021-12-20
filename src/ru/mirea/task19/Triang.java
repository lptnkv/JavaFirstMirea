package ru.mirea.task19;

public class Triang {
    private double angle1, angle2, angle3;

    public Triang() {
    }

    public Triang(double angle1, double angle2, double angle3) throws MyException {
        if (angle1 != 90 && angle2 != 90 && angle3 != 90) {
            throw new MyException("Отсутствует прямой угол");
        } else {
            if (angle1 == 90 && (angle2 + angle3) != 90) {
                throw new MyException("Неправильные значения углов");
            } else if (angle2 == 90 && (angle1 + angle3) != 90) {
                throw new MyException("Неправильные значения углов");
            } else if (angle3 == 90 && (angle1 + angle2) != 90) {
                throw new MyException("Неправильные значения углов");
            }
        }
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }

    @Override
    public String toString() {
        return "Triang{" +
                "angle1=" + angle1 +
                ", angle2=" + angle2 +
                ", angle3=" + angle3 +
                '}';
    }
}
