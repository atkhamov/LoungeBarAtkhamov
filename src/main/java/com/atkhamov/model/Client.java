package com.atkhamov.model;

public class Client {

    private Integer id;
    private String name;
    private int phone;
    private String address;
    private String dateOfBirth;
    private int discountRate;
    private int lastOrderSum;
    private String favFood;
    private String favDrink;

    //GettersRegion
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int getLastOrderSum() {
        return lastOrderSum;
    }

    public String getFavFood() {
        return favFood;
    }

    public String getFavDrink() {
        return favDrink;
    }
    //endOfRegion

    //SettersRegion
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public void setLastOrderSum(int lastOrderSum) {
        this.lastOrderSum = lastOrderSum;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public void setFavDrink(String favDrink) {
        this.favDrink = favDrink;
    }
    //endOfRegion

}
