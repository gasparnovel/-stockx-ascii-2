package edu.ping.stockx.domain.criteria;

import java.util.List;

import edu.ping.stockx.domain.Item;
import edu.ping.stockx.domain.Offer;

public interface Criteria {

    List<Offer> checkCriteria(Item item);

}
