package edu.ping.stockx.domain.offer;

import java.util.ArrayList;
import java.util.List;

public class Sale implements Offer {

    private String size;
    private Integer price;

    public Sale(String size, int price) {
        this.size = size;
        this.price = price;
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
    public int compareTo(Offer offer) {
        return 0;
    }

    @Override
    public String toString() {
        return size() + "       "+ value();
    }
}
