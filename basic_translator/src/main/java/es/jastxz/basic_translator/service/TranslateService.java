package es.jastxz.basic_translator.service;

import es.jastxz.basic_translator.model.TranslatorResponse;

public interface TranslateService {
    
    public TranslatorResponse translate(String text, String sourceLang, String targetLang);

}
