package org.ga4gh.discovery.search;

public class Field {

    private final String id;
    private final String name;
    private final String type;
    private final String[] operators;
    private final String[] options;
    private final String table;
    
    public Field(String id, String name, String type, String[] operators, String[] options, String table) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.operators = operators;
        this.options = options;
        this.table = table;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String[] getOperators() {
        return operators;
    }

    public String[] getOptions() {
        return options;
    }

    public String getTable() {
        return table;
    }
    
    
}
