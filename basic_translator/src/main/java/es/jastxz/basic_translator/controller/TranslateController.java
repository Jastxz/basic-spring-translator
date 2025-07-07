package es.jastxz.basic_translator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import es.jastxz.basic_translator.model.TranslatorRequest;
import es.jastxz.basic_translator.model.TranslatorResponse;
import es.jastxz.basic_translator.service.TranslateService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/translate")
public class TranslateController {

    private final TranslateService service;

    public TranslateController(TranslateService service) {
        this.service = service;
    }

    @PostMapping
    public Mono<ResponseEntity<TranslatorResponse>> translate(@RequestBody TranslatorRequest request) {
        return service.translate(request.getText(), request.getSourceLang(), request.getTargetLang())
                .map(ResponseEntity::ok);
    }
}
