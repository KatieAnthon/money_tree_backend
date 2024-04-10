package com.makers.moneytree.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spendanalysis")
public class SpendAnalysisController {

    @GetMapping("/spendtotals")
    public ResponseEntity<List> getSpend() {
        return ResponseEntity.ok(List.of(123, 321, 123, 789, 537));
    };
}
