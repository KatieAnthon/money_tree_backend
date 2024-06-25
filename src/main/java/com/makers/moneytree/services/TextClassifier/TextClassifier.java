package com.makers.moneytree.services.TextClassifier;

import org.springframework.stereotype.Service;

@Service
public class TextClassifier {

    private final ChatClient chatClient;

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
