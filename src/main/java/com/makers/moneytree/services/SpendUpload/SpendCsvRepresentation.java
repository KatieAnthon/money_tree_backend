package com.makers.moneytree.services.SpendUpload;


import com.opencsv.bean.CsvBindByName;

public class SpendCsvRepresentation {
    @CsvBindByName(column = "Date")
    private String date;

    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "Amount")
    private String amount;

    @CsvBindByName(column = "Currency")
    private String currency;

    public SpendCsvRepresentation() {
    }

    public SpendCsvRepresentation(String date, String name, String amount, String currency) {
        this.date = date;
        this.name = name;
        this.amount = amount;
        this.currency = currency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
