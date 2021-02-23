package edu.ping.stockx.domain.criteria;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import edu.ping.stockx.domain.offer.Offer;
import edu.ping.stockx.domain.offer.Sale;
import edu.ping.stockx.domain.item.Item;

public class LastSale implements Criteria {


    public LastSale(){

    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        return sneaker.offers().stream().filter(offer -> offer instanceof Sale)
                .reduce((first, second) -> second)
                .stream().collect(Collectors.toList());
    }
}