package com.makers.moneytree.model.SpendAnalysis;


import java.util.Date;
import java.util.Map;
public class SpendAnalysis {
    String id;
    String userid;
    Date date;
    String name;
    Integer amount;
    String currency;
    Map<String, Integer> categories;

    public SpendAnalysis(String id, String userid, Date date, String name, Integer amount, String currency, Map<String, Integer> categories) {
        this.id = id;
        this.userid = userid;
        this.date = date;
        this.name = name;
        this.amount = amount;
        this.currency = currency;
        this.categories = categories;
    }
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Map<String, Integer> getCategories() {
        return categories;
    }

    public void setCategories(Map<String, Integer> categories) {
        this.categories = categories;
    }
}
