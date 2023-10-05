package com.udemy.section1.exercise1;

public class OrderItem {
    private int orderId;
    private int itemId;
    private int quantity;
    private int unitPrice;

    protected OrderItem(){}
    public OrderItem(int orderId, int itemId, int quantity, int unitPrice) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderId=" + orderId +
                ", itemId=" + itemId +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
