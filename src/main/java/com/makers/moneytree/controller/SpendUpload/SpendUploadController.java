package com.makers.moneytree.controller.SpendUpload;

import com.makers.moneytree.services.SpendUpload.SpendUploadService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/spendanalysis")
public class SpendUploadController {

    private final SpendUploadService spendUploadService;

    public SpendUploadController(SpendUploadService spendUploadService) {
        this.spendUploadService = spendUploadService;
    }

    @GetMapping("/spendtotals")
    public ResponseEntity<List> getSpend() {
        return ResponseEntity.ok(List.of(123, 321, 123, 789, 537));
    };

    @PostMapping(value = "/spendtotals/add", consumes = {"multipart/form-data"} )
    public ResponseEntity<Integer> uploadStatement(
            @RequestParam("file")MultipartFile file) throws IOException {
        return ResponseEntity.ok(spendUploadService.addSpendFile(file));

    }
}


