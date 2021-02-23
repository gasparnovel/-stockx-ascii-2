package edu.ping.stockx.domain.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.ping.stockx.domain.item.Item;
import edu.ping.stockx.domain.offer.Offer;
import edu.ping.stockx.domain.offer.Sale;

public class Sales implements Criteria {

    public Sales() {

    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers().stream().filter(offer -> offer instanceof Sale)
                .collect(Collectors.toList());
    }


}
