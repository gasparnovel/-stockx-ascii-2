package edu.ping.stockx.domain.offer;

public interface Offer {

    String size();

    int value();

    int compareTo(Offer offer);

}
