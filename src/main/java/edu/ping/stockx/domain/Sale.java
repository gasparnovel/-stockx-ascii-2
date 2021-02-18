package edu.ping.stockx.domain;

import java.util.ArrayList;
import java.util.List;

public class Sale implements Offer {

    private String size;
    private Integer price;

    public  List<Offer> plist = new ArrayList<Offer>();

    public Sale(String size, int price) {
        this.size = size;
        this.price = price;
    }

    public void add(Offer price) {
        plist.add(price);
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;
    }

    @Override
    public String toString() {
        return size() + "       "+ value();
    }

    @Override
    public int compareTo(List<Offer> sneaker) {
        // TODO Auto-generated method stub
        return 0;
    }

}
