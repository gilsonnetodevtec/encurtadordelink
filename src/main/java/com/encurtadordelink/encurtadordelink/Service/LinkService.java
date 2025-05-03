package com.encurtadordelink.encurtadordelink.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encurtadordelink.encurtadordelink.DTO.LinkDTO;

@Service
public class LinkService {

    @Autowired
    private LinkDTO linkDTO;
    
    public String encurtarUrl(String urlOriginal) {
       
        return "https://short111.teste.com/" + urlOriginal.hashCode();
    }
}