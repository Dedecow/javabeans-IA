package com.animahub.javabeans.ia.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeepseekConfig {

    @Value("${deepseek.endpoint:}")
    private String endpoint;

    @Value("${deepseek.key:}")
    private String apiKey;

    public String getEndpoint() {
        return endpoint;
    }

    public String getApiKey() {
        return apiKey;
    }
}
