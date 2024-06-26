package com.makers.moneytree.services.TextClassifier;

import org.springframework.stereotype.Service;
import opennlp.tools.doccat.DoccatModel;
import opennlp.tools.doccat.DocumentCategorizerME;
import opennlp.tools.util.InputStreamFactory;
import opennlp.tools.util.PlainTextByLineStream;

@Service
public class TextClassifierService {

    private DoccatModel model;

    TextClassifier(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder
                .defaultOptions(ChatOptionsBuilder.builder()
                        .withTemperature(0.0f)
                        .build())
                .build();
    }

    String classify(String text) {
        return "";
    }
}
