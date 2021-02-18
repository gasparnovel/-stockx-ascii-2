package edu.ping.stockx.domain;

public interface Offer {

    String size();

    int value();

    int compareTo(Offer offer);

}
