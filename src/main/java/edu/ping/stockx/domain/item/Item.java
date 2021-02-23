package edu.ping.stockx.domain.item;

import java.util.List;

import edu.ping.stockx.domain.offer.Offer;

public interface Item {

    int getAsk();

    int getBid();

    int getSale();

    void add(Offer offer);

    List<Offer> offers();

    void setAsk(int ask);

    void setBid(int bid);

    void setSale(int sale);
}
