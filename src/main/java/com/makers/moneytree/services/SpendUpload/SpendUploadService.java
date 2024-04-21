package com.makers.moneytree.services.SpendUpload;

import com.makers.moneytree.model.SpendAnalysis.SpendAnalysis;
import com.makers.moneytree.repository.SpendAnalysis.SpendAnalysisRepository;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SpendUploadService {

    private final SpendAnalysisRepository repository;

    public Integer addSpendFile(MultipartFile file) throws IOException {
        Set<SpendAnalysis> spendAnalysis = parseCSV(file);
        repository.saveAll(spendAnalysis);
        return spendAnalysis.size();
    }

    private Set<SpendAnalysis> parseCSV(MultipartFile file) throws IOException {
        try(Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            HeaderColumnNameMappingStrategy<SpendCsvRepresentation> strategy =
                    new HeaderColumnNameMappingStrategy<>();
            // Set the parsing strategy
            strategy.setType(SpendCsvRepresentation.class);
            CsvToBean<SpendCsvRepresentation> csvToBean =
                    new CsvToBeanBuilder<SpendCsvRepresentation>(reader)
                            .withMappingStrategy(strategy)
                            .withIgnoreEmptyLine(true)
                            .withIgnoreLeadingWhiteSpace(true)
                            .build();

            return csvToBean.parse()
                    .stream()
                    .map(csvLine -> SpendAnalysis.builder()
                            .date(csvLine.getDate())
                            .name(csvLine.getName())
                            .amount(csvLine.getAmount())
                            .currency(csvLine.getCurrency())
                            .build()
                    )
                    .collect(Collectors.toSet());
        }

    }

}
