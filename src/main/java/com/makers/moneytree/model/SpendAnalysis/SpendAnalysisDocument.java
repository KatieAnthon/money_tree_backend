package com.makers.moneytree.model.SpendAnalysis;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "spend")
public class SpendAnalysisDocument {

    @Id
    private String id;

    private String userid;

    private Map<String, Integer> categories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Map<String, Integer> getCategories() {
        return categories;
    }

    public void setCategories(Map<String, Integer> categories) {
        this.categories = categories;
    }
}
