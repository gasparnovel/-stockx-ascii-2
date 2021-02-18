package edu.ping.stockx.domain;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

	private final List<Offer> offers = new ArrayList<Offer>();


    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return this.style;
    }

    public String getName() {
        return this.name;
    }

    public int getSale() {
        return sale;
    }

    public int getAsk() {
        return ask;
    }

    public int getBid() {
        return bid;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void add(Offer offer) {
        this.offers.add(offer);
    }

    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public String toString() {
        return  getName() + "\n" +
            "                " + getStyle();
    }

    
}

