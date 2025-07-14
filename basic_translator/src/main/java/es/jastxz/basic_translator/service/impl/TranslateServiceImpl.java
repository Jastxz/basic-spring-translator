package es.jastxz.basic_translator.service.impl;

import org.springframework.stereotype.Service;

import es.jastxz.basic_translator.model.TranslatorResponse;
import es.jastxz.basic_translator.service.TranslateService;

@Service
public class TranslateServiceImpl implements TranslateService {

    public TranslatorResponse translate(String text, String sourceLang, String targetLang) {
        //TODO integrar la IA local desarrollada
        return null;
    }
}
