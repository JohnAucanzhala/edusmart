package com.edusmart.config;

import com.edusmart.service.EduSmartAIService;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIConfig {

    @Bean
    public EduSmartAIService eduSmartAIService() {

        OpenAiChatModel model = OpenAiChatModel.builder()
                .apiKey("demo")
                .modelName("gpt-3.5-turbo")
                .build();

        return AiServices.create(EduSmartAIService.class, model);
    }
}