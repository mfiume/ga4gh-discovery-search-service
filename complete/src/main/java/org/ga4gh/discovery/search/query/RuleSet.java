/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ga4gh.discovery.search.query;

import java.util.List;

/**
 *
 * @author mfiume
 */
public class RuleSet {
    
    private final Condition condition;
    private final List<Rule> rules; 

    public RuleSet(Condition condition, List<Rule> rules) {
        this.condition = condition;
        this.rules = rules;
    }

    public Condition getCondition() {
        return condition;
    }

    public List<Rule> getRules() {
        return rules;
    }
    
}
