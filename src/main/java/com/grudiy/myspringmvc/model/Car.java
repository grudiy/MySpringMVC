package com.grudiy.myspringmvc.model;

public class Car {
    private Long id;
    private Brand brand;
    private String model;
    private int price;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand=" + brand +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}