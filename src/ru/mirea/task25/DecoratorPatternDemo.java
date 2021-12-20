package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        RedShapeDecorator circle_decorator = new RedShapeDecorator(circle);
        circle_decorator.setRedBorder();
        circle_decorator.draw();

        Shape rect = new Rectangle();
        RedShapeDecorator rect_decorator = new RedShapeDecorator(rect);
        rect_decorator.setRedBorder();
        rect_decorator.draw();
    }
}
