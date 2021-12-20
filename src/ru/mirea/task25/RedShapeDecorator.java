package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        this.shape.draw();
    }

    void setRedBorder(){
        System.out.println("Установлен красный цвет границы");
    }
}
