package edu.ping.stockx.domain.criteria;

import java.util.List;

import edu.ping.stockx.domain.Offer;
import edu.ping.stockx.domain.Sneaker;

public interface Criteria {

    List<Offer> checkCriteria(Item);

}
