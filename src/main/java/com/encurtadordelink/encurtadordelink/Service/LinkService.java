package com.encurtadordelink.encurtadordelink.Service;

import org.springframework.stereotype.Service;

@Service
public class LinkService {
    
    public String encurtarUrl(String urlOriginal) {
       
        return "https://short111.teste.com/" + urlOriginal.hashCode();
    }
}