package com.planittesting.cloud.jupiter.pom.objects;

public class Product {

    private String name;
    private String price;

    public Product() {}

    public Product(String productName, String productPrice) {
        name = productName;
        price = productPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
