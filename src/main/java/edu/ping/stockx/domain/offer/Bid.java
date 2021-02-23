package edu.ping.stockx.domain.offer;

import java.util.ArrayList;
import java.util.List;

public class Bid implements Offer {

    private String size;
    private Integer bid;

    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.bid;
    }

    @Override
    public int compareTo(Offer offer) {
        return 0;
    }

    @Override
    public String toString() {
        return "Size: " + size() + "\n" +
            "Price: " + value() + "\n" + "\n";
    }

}
