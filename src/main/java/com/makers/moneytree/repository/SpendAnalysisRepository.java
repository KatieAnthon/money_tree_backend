package com.makers.moneytree.repository;

import com.makers.moneytree.model.SpendAnalysis;
import com.makers.moneytree.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SpendAnalysisRepository extends MongoRepository<SpendAnalysis, String> {
}
