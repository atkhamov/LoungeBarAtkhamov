package com.atkhamov.model;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @Column(name="client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer client_id;

    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;

    @Column(name="address")
    private String address;

    @Column(name="dateOfBirth")
    private String dateOfBirth;

    @Column(name="discountRate")
    private int discountRate;

    @Column(name="lastOrderSum")
    private int lastOrderSum;

    @Column(name="favFood")
    private String favFood;

    @Column(name="favDrink")
    private String favDrink;


    //GettersRegion
    public int getId() {
        return client_id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
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
        this.client_id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
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

    //Method toString to perform Logging
    @Override
    public String toString() {
        return "Client{" +
                "client_id=" + client_id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", discountRate=" + discountRate +
                ", lastOrderSum=" + lastOrderSum +
                ", favFood='" + favFood + '\'' +
                ", favDrink='" + favDrink + '\'' +
                '}';
    }
    //endOfRegion

}