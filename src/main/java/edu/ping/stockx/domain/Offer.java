package edu.ping.stockx.domain;

import java.util.List;

public interface Offer {
    
    String size();
    
    int value();

    int compareTo(List<Offer> sneaker);

}
