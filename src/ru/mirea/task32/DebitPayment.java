package ru.mirea.task32;

public class DebitPayment extends Payment {
    public DebitPayment(int productId, int orderId) {
        super(productId, orderId);
        this.setStrategy(new DebitPayStrategy());
    }
}
