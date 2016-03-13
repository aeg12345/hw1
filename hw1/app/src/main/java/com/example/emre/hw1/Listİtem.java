package com.example.emre.hw1;

/**
 * Created by Emre on 12.3.2016.
 */
public class Listİtem {

    int image;
    boolean check;
    String product;
    double price;
    public Listİtem(int image, boolean check, String product, double price) {
        this.image = image;
        this.check = check;
        this.product = product;
        this.price = price;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
