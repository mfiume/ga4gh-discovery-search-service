/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ga4gh.discovery.search;

import java.util.List;
import org.ga4gh.discovery.search.query.SearchQuery;
import org.ga4gh.discovery.search.query.result.SearchResult;
import org.springframework.stereotype.Service;

/**
 * 
 * @author mfiume
 */
@Service
public interface SearchProvider {

    public List<Field> getFields();

    public SearchResult search(SearchQuery query);
    
}
