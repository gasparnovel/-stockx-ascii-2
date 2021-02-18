package edu.ping.stockx.domain;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;

	private List<Offer> sneaker = new ArrayList<Offer>();


    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public Object getStyle() {
        return this.style;
    }

    public Object getName() {
        return this.name;
    }

    public int getSale() {
        return this.sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getAsk() {
        return this.ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public int getBid() {
        return this.bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public List<Offer> offers(){
        return this.sneaker;
    }


    @Override
    public String toString() {
        return  getName() + "\n" +
            "                " + getStyle();
    }

    public void add(Bid bid) {
        sneaker.add(bid);
    }

    public void add(Ask ask) {
        sneaker.add(ask);
    }

    public void add(Sale sale) {
        sneaker.add(sale);
    }

    @Override
    public void add(Offer sneaker) {
        // TODO Auto-generated method stub

    }
}
