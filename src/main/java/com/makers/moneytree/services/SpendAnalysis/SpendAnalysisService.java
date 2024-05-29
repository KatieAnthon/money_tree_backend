package com.makers.moneytree.services.SpendAnalysis;

import com.makers.moneytree.model.SpendAnalysis.SpendAnalysis;
import com.makers.moneytree.repository.SpendAnalysis.SpendAnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpendAnalysisService {

    private final SpendAnalysisRepository spendAnalysisRepository;
    @Autowired
    public SpendAnalysisService(SpendAnalysisRepository spendAnalysisRepository)
    {
        this.spendAnalysisRepository = spendAnalysisRepository;
    };

    public List<SpendAnalysis> findSpendHistory() {
        return spendAnalysisRepository.findAll();
    }

}