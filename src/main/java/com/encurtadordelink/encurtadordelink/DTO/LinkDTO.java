package com.encurtadordelink.encurtadordelink.DTO;

public class LinkDTO {

    private String uid;
    private String urlOriginal;
    private String urlEncurtada;

    public LinkDTO() {
    }

    public LinkDTO(String uid, String urlOriginal) {
        this.uid = uid;
        this.urlOriginal = urlOriginal;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUrlOriginal() {
        return urlOriginal;
    }

    public void setUrlOriginal(String urlOriginal) {
        this.urlOriginal = urlOriginal;
    }

    public String getUrlEncurtada() {
        return urlEncurtada;
    }
    public void setUrlEncurtada(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }

    @Override
    public String toString() {
        return "LinkDTO{" +
                "uid='" + uid + '\'' +
                ", urlOriginal='" + urlOriginal + '\'' +
                '}';
    }
}

