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
public class SearchQuery extends RuleSet {
    
    public SearchQuery(Condition condition, List<Rule> rules) {
        super(condition, rules);
    }

}
