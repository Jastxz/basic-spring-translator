package es.jastxz.basic_translator.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import es.jastxz.basic_translator.model.TranslatorResponse;
import es.jastxz.basic_translator.service.TranslateService;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
public class TranslateServiceImpl implements TranslateService {

    private final WebClient webClient;

    public TranslateServiceImpl(WebClient.Builder builder) {
        this.webClient = builder
            .baseUrl("http://localhost:5000") // LOCALHOST Docker
            .build();
    }

    public Mono<TranslatorResponse> translate(String text, String sourceLang, String targetLang) {
        return webClient.post()
            .uri("/translate")
            .bodyValue(Map.of(
                "q", text,
                "source", sourceLang,
                "target", targetLang,
                "format", "text"
            ))
            .retrieve()
            .bodyToMono(TranslatorResponse.class);
    }
}
