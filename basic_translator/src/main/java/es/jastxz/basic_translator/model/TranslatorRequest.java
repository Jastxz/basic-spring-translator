package es.jastxz.basic_translator.model;

import java.math.BigInteger;

import lombok.Data;

@Data
public class TranslatorRequest {
    
    private final String text;
    private final String sourceLang;
    private final String targetLang;

}
