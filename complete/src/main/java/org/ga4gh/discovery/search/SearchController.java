package org.ga4gh.discovery.search;

import org.ga4gh.discovery.search.query.result.SearchResult;
import org.ga4gh.discovery.search.query.SearchQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    private final SearchProvider dataSource;
    
    public SearchController(SearchProvider dataSource) {
        this.dataSource = dataSource;
    }
    
    @RequestMapping("/search")
    public SearchResult search(@RequestParam(required = false) SearchQuery query) {
        return dataSource.search(query);
    }
}
