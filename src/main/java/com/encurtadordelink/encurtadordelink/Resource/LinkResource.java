package com.encurtadordelink.encurtadordelink.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/links")
public class LinkResource {

    @PostMapping("/encurtar")
    public ResponseEntity<String> encurtar(@RequestBody String urlOriginal) {
        if (urlOriginal == null || urlOriginal.isBlank()) {
            return ResponseEntity.badRequest().body("URL inválida");
        }

        String urlEncurtada = "https://short.teste.com/";
        return ResponseEntity.ok(urlEncurtada);
    }
}