package com.encurtadordelink.encurtadordelink.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "links")
@Getter
@Setter
@EqualsAndHashCode
public class Link {

    @Id
    private String uid;

    private String urlOriginal;
}
