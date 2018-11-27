package com.rpl.restjoy.model;

public class Menu {
    public static final String MENU = "MENU";

    private String menuID;
    private String menuName;
    private String menuPicture;
    private int menuPrice;
    private String categoryId;
    private String categoryName;
    private String menuDesc;
    private int total;

    private Boolean menuAvailable;
    Restaurant restaurant;

    public Menu(){ }

    public String getMenuID() {
        return menuID;
    }

    public void setMenuID(String menuID) {
        this.menuID = menuID;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuPicture() {
        return menuPicture;
    }

    public void setMenuPicture(String menuPicture) {
        this.menuPicture = menuPicture;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Boolean getMenuAvailable() {
        return menuAvailable;
    }

    public void setMenuAvailable(Boolean menuAvailable) {
        this.menuAvailable = menuAvailable;
    }

}
