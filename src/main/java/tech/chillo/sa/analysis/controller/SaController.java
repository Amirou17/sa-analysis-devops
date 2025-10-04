package tech.chillo.sa.analysis.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.chillo.sa.analysis.dto.SaRecord;

import java.util.List;

@RestController
@RequestMapping(path = "sa", produces = MediaType.APPLICATION_JSON_VALUE)
public class SaController {

    @GetMapping
    public List<Object> search() {
        return List.of(new SaRecord(1, "Belle formation", 2));
    }
}
