package com.example.casenhom3.model;

public class OrderDetail {
    private long id;
    private Orders order_id;
    private Product product_id;
    private int quantity;
    private double amount;
    private double sumAmount;

    public OrderDetail() {
    }

    public OrderDetail(long id, Orders order_id, Product product_id, int quantity, double amount) {
        this.id = id;
        this.order_id = order_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.amount = amount;
    }

    public OrderDetail(Orders order_id, double sumAmount) {
        this.order_id = order_id;
        this.sumAmount = sumAmount;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Orders getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Orders order_id) {
        this.order_id = order_id;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getSumAmount() {
        return sumAmount;
    }

}