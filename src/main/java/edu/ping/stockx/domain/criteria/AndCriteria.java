package edu.ping.stockx.domain.criteria;

import java.util.List;

import edu.ping.stockx.domain.Item;
import edu.ping.stockx.domain.Offer;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otheCriteria;

    public AndCriteria(Criteria criteria, Criteria otheCriteria) {
        this.criteria = criteria;
        this.otheCriteria = otheCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
