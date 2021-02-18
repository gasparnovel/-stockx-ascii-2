package edu.ping.stockx.domain;

import java.util.List;

public class Ask implements Offer{

    private String size;
    private Integer ask;

    public Ask(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.ask;
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
