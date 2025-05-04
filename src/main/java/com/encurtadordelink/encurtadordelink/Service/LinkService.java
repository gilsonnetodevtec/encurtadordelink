package com.encurtadordelink.encurtadordelink.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encurtadordelink.encurtadordelink.DTO.LinkDTO;
import com.encurtadordelink.encurtadordelink.Entity.Link;
import com.encurtadordelink.encurtadordelink.Repository.LinkRepository;

@Service
public class LinkService {

    @Autowired
    private LinkRepository linkRepository;

    public LinkDTO encurtarUrl(String urlOriginal) {

        String uid = UUID.randomUUID().toString().substring(0, 8);
        String urlEncurtada = "https://encurtadoLink" + uid;

        Link link = new Link();
        link.setUid(uid);
        link.setUrlOriginal(urlOriginal);
        link.setUrlEncurtada(urlEncurtada);

        linkRepository.save(link);

        return new LinkDTO(uid, urlOriginal, urlEncurtada);
    }
}
