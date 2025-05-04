package com.encurtadordelink.encurtadordelink.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encurtadordelink.encurtadordelink.DTO.LinkDTO;
import com.encurtadordelink.encurtadordelink.Service.LinkService;

@RestController
@RequestMapping("/api/links")
public class LinkResource {

    @Autowired
    private LinkService linkService;

    @PostMapping("/encurtar")
    public ResponseEntity<LinkDTO> encurtar(@RequestBody String urlOriginal) {
        if (urlOriginal == null || urlOriginal.isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        LinkDTO urlEncurtada = linkService.encurtarUrl(urlOriginal);
        return ResponseEntity.ok(urlEncurtada);
    }
}
