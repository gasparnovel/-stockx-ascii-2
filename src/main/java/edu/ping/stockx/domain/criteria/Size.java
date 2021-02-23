package edu.ping.stockx.domain.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.ping.stockx.domain.item.Item;
import edu.ping.stockx.domain.offer.Offer;
import edu.ping.stockx.domain.offer.Sale;

public class Size implements Criteria {

    private String size;

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> sales = sneaker.offers().stream().filter(offer -> offer instanceof Sale)
                .collect(Collectors.toList());

        return sales.stream().filter(s -> s.size().equals(this.size))
                .collect(Collectors.toList());
    }
}
