package es.jastxz.basic_translator.service;

import es.jastxz.basic_translator.model.TranslatorResponse;
import reactor.core.publisher.Mono;

public interface TranslateService {
    
    public Mono<TranslatorResponse> translate(String text, String sourceLang, String targetLang);

}
