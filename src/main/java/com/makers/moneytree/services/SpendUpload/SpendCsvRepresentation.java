package com.makers.moneytree.services.SpendUpload;


import com.opencsv.bean.CsvBindByName;

import java.util.Date;

public class SpendCsvRepresentation {
    @CsvBindByName(column = "Date")
    private Date date;

    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "Amount")
    private Integer amount;

    @CsvBindByName(column = "Currency")
    private String currency;

    public SpendCsvRepresentation() {
    }

    public SpendCsvRepresentation(Date date, String name, Integer amount, String currency) {
        this.date = date;
        this.name = name;
        this.amount = amount;
        this.currency = currency;
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
}
