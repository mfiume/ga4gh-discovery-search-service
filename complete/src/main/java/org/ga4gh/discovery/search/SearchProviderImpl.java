/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ga4gh.discovery.search;

import java.util.ArrayList;
import java.util.List;
import org.ga4gh.discovery.search.query.SearchQuery;
import org.ga4gh.discovery.search.query.result.ResultRow;
import org.ga4gh.discovery.search.query.result.SearchResult;
import org.springframework.stereotype.Service;

@Service
public class SearchProviderImpl implements SearchProvider {

    @Override
    public List<Field> getFields() {
        List<Field> fields = new ArrayList<Field>();
        fields.add(new Field("id", "name", "type", new String[0], new String[0], "table"));
        return fields;
    }

    @Override
    public SearchResult search(SearchQuery query) {
        List<Field> fields = new ArrayList<Field>();
        List<ResultRow> results = new ArrayList<ResultRow>();
        SearchResult searchResult = new SearchResult(fields,results);
        return searchResult;
    }
    
}
