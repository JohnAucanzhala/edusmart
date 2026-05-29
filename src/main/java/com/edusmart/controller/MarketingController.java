package com.edusmart.controller;

import com.edusmart.service.EduSmartAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketingController {

    private final EduSmartAIService eduSmartAIService;

    public MarketingController(EduSmartAIService eduSmartAIService) {
        this.eduSmartAIService = eduSmartAIService;
    }

    @GetMapping("/publicidad")
    public String generarPublicidad(
            @RequestParam String tema,
            @RequestParam String audiencia
    ) {

        try {
            return eduSmartAIService.generarPublicidad(tema, audiencia);

        } catch (Exception e) {
            return "Promoción especial del curso de " + tema +
                    " para " + audiencia;
        }
    }
}
