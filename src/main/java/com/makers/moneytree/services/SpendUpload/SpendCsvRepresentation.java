package com.makers.moneytree.services.SpendUpload;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class SpendCsvRepresentation {

    @CsvBindByName(column = "Date")
    private Date date;

    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "Amount")
    private Integer amount;

    @CsvBindByName(column = "Currency")
    private String currency;

}
