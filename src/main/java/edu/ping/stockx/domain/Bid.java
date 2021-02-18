package edu.ping.stockx.domain;

import java.util.ArrayList;
import java.util.List;

public class Bid implements Offer {

    private String size;
    private Integer bid;

    public  List<Offer> blist = new ArrayList<Offer>();

    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    public void add(Offer bid) {
        blist.add(bid);
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
    public int compareTo(List<Offer> offer) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return size() + "       "+ value();
    }
}
