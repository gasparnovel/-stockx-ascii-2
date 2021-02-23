package edu.ping.stockx.domain.criteria;

import java.util.List;

import edu.ping.stockx.domain.item.Item;
import edu.ping.stockx.domain.offer.Offer;



public interface Criteria {

    List<Offer> checkCriteria(Item sneaker);

}
