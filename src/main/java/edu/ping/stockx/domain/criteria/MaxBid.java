package edu.ping.stockx.domain.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.ping.stockx.domain.item.Item;
import edu.ping.stockx.domain.offer.Bid;
import edu.ping.stockx.domain.offer.Offer;


public class MaxBid implements Criteria {

    public MaxBid() {

    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        
        return sneaker.offers().stream().filter(offer -> offer instanceof Bid)
                    .max(Comparator.comparing(Offer::value))
                    .stream().collect(Collectors.toList());
    }
}
