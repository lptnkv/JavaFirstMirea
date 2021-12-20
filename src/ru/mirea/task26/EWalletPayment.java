package ru.mirea.task26;

public class EWalletPayment extends Payment {
    public EWalletPayment(int productId, int orderId) {
        super(productId, orderId);
        this.setStrategy(new EWalletPayStrategy());
    }
}
