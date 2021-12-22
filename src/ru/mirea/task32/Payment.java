package ru.mirea.task32;

public abstract class Payment {
    private int productId;
    private int orderId;
    private PayStrategy strategy;

    public Payment(int productId, int orderId) {
        this.productId = productId;
        this.orderId = orderId;
    }

    public void setStrategy(PayStrategy strategy){
        this.strategy = strategy;
    }

    public void pay(){
        this.strategy.pay();
    }
}
