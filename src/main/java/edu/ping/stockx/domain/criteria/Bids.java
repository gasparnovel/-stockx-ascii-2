package edu.ping.stockx.domain.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.ping.stockx.domain.Bid;
import edu.ping.stockx.domain.Item;
import edu.ping.stockx.domain.Offer;

public class Bids implements Criteria {

    public Bids() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream().filter(offer -> offer instanceof Bid)
                .collect(Collectors.toList());
    }
}