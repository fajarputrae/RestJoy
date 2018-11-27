package com.rpl.restjoy.model;

public class OrderDetail {

    public static final String ORDER_DETAIL = "ORDER_DETAIL";

    private String orderId;
    private Integer discountPrice;
    Restaurant resto;
    User user;
    Menu menu;
    private Double price;
    private Double subTotalPrice;

    public OrderDetail(){}

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Restaurant getResto() {
        return resto;
    }

    public void setResto(Restaurant resto) {
        this.resto = resto;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSubTotalPrice() {
        return subTotalPrice;
    }

    public void setSubTotalPrice(Double subTotalPrice) {
        this.subTotalPrice = subTotalPrice;
    }

}
