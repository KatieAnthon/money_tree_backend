package com.makers.moneytree.services.SpendAnalysis;

import com.makers.moneytree.model.SpendAnalysis.SpendAnalysis;
import com.makers.moneytree.repository.SpendAnalysis.SpendAnalysisRepository;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SpendAnalysisService {

    private final SpendAnalysisRepository repository;

    public SpendAnalysisService(SpendAnalysisRepository repository) {
        this.repository = repository;
    }

    public List<SpendAnalysis> findSpendHistory() {
        return repository.findAll();
    }

    public Integer addSpendFile(MultipartFile file) throws IOException {
        Set<SpendAnalysis> spendAnalysis = parseCSV(file);
        repository.saveAll(spendAnalysis);
        return spendAnalysis.size();
    }
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
                    .map(csvLine -> {
                            LocalDate date = LocalDate.parse(csvLine.getDate(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                            Double amount = Double.parseDouble(csvLine.getAmount());

                            return new SpendAnalysis(
                            null,
                            null,
                            date,
                            csvLine.getName(),
                            amount,
                            csvLine.getCurrency(),
                            null);
                    })
                    .collect(Collectors.toSet());

        }

    }

}
