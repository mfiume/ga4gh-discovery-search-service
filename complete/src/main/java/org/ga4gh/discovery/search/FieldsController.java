package org.ga4gh.discovery.search;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FieldsController {

    private final SearchProvider dataSource;
    
    public FieldsController(SearchProvider dataSource) {
        this.dataSource = dataSource;
    }
    
    @RequestMapping("/fields")
    public List<Field> fields(@RequestParam(value="table", defaultValue="") String table) {
        return dataSource.getFields();
    }
}
