package edu.ping.stockx.domain;

import java.util.List;

public interface Item {

    int getBid();

    int getAsk();

    int getSale();

    void add(Offer sneaker);

    void setBid(int bid);

    void setAsk(int ask);

    void setSale(int sale);


}
