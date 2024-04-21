package com.makers.moneytree.repository.SpendAnalysis;

import com.makers.moneytree.model.SpendAnalysis.SpendAnalysis;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpendAnalysisRepository extends MongoRepository<SpendAnalysis, String> {
}
