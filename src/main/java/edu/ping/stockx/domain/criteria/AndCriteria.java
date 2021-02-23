package edu.ping.stockx.domain.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.ping.stockx.domain.item.Item;
import edu.ping.stockx.domain.offer.Offer;
import edu.ping.stockx.domain.offer.Sale;


public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        
        List<Offer> criteria = sneaker.offers().stream().filter(offer -> offer instanceof Sale)
        .collect(Collectors.toList());

        List<Offer> otherCriteria = sneaker.offers().stream().filter(offer -> offer instanceof Size)
        .collect(Collectors.toList());

        return criteria.stream().filter(c -> c.size().equals(this.criteria))
            .collect(Collectors.toList()), otherCriteria.stream().filter(o -> o.size().equals(this.otherCriteria))
                .collect(Collectors.toList());
    }
}
