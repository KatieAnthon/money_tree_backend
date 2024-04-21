//package com.makers.moneytree.services.SpendAnalysis;
//
//import com.makers.moneytree.model.SpendAnalysis.SpendAnalysis;
//import com.makers.moneytree.repository.SpendAnalysis.SpendAnalysisRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//
//public class SpendAnalysisService {
//    @Autowired
//    private SpendAnalysisRepository SpendAnalysisRepository;
//
//    public String addSpend(MultipartFile file) throws IOException {
//        SpendAnalysis spendAnalysis = new SpendAnalysis(file)
//    }
//
////    public String saveSpendAnalysis(SpendAnalysis SpendAnalysis) {
////
////        Optional<SpendAnalysis> SpendAnalysisFound = SpendAnalysisRepository.findByuserId(SpendAnalysis.getEmail());
////
////        if (SpendAnalysisFound.isPresent()) {
////            return "Email already exists";
////        }
////        SpendAnalysisRepository.save(SpendAnalysis);
////        return SpendAnalysis.toString() + "added";
////    }
////
////    public Optional<SpendAnalysis> findSpendAnalysisByName(String name) {
////        return SpendAnalysisRepository.findById(name);
////    }
////
////    public Optional<SpendAnalysis> findSpendAnalysisLogIn(SpendAnalysis SpendAnalysis) {
////        return SpendAnalysisRepository.findByEmail(SpendAnalysis.getEmail())
////                .filter(u -> u.getPassword().equals(SpendAnalysis.getPassword()));
////    }
//
//
//}
