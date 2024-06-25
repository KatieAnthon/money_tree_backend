package com.makers.moneytree.controller.SpendUpload;

import com.makers.moneytree.services.SpendAnalysis.SpendAnalysisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/spendanalysis")
public class SpendAnalysisController {

    private SpendAnalysisService spendAnalysisService;

    public SpendAnalysisController(SpendAnalysisService spendAnalysisService) {
        this.spendAnalysisService = spendAnalysisService;
    }
    @GetMapping("/spendtotals")
    public ResponseEntity<List> getSpend() {
        return ResponseEntity.ok(List.of(123, 321, 123, 789, 537));
    };

    @GetMapping("/spendhistory")
    public ResponseEntity<List> getSpendHistory() {
        return ResponseEntity.ok(spendAnalysisService.findSpendHistory());
    };
    @PostMapping(value = "/spendtotals/add", consumes = {"multipart/form-data"} )
    public ResponseEntity<Integer> uploadStatement(
            @RequestParam("file")MultipartFile file) throws IOException {
        return ResponseEntity.ok(spendAnalysisService.addSpendFile(file));

    }
}


