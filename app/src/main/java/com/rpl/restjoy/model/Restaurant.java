package com.rpl.restjoy.model;

public class Restaurant {
    public static final String RESTAURANT = "RESTAURANT";

    private String restaurantID;
    private String restaurantName;
    private String ownerEmail;
    private String ownerId;
    private String ownerUsername;
    private Double tax;
    private Integer numOfReview;
    private Double lng;
    private Double lat;
    String restaurantType;
    private String address;
    private Integer closeTime;
    private Integer openTime;
    private String restaurantPicBig;
    private String picThumbnail;
    private String restaurantWebPage;
    private String phone;
    Category category;


    public Restaurant() {
    }

    public String getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Integer getNumOfReview() {
        return numOfReview;
    }

    public void setNumOfReview(Integer numOfReview) {
        this.numOfReview = numOfReview;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Integer closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Integer openTime) {
        this.openTime = openTime;
    }

    public String getRestaurantPicBig() {
        return restaurantPicBig;
    }

    public void setRestaurantPicBig(String restaurantPicBig) {
        this.restaurantPicBig = restaurantPicBig;
    }

    public String getPicThumbnail() {
        return picThumbnail;
    }

    public void setPicThumbnail(String picThumbnail) {
        this.picThumbnail = picThumbnail;
    }

    public String getRestaurantWebPage() {
        return restaurantWebPage;
    }

    public void setRestaurantWebPage(String restaurantWebPage) {
        this.restaurantWebPage = restaurantWebPage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
