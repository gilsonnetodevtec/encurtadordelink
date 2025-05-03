package com.encurtadordelink.encurtadordelink.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.encurtadordelink.encurtadordelink.DTO.LinkDTO;

public interface LinkRepository extends JpaRepository<LinkDTO, Long> {
    Optional<LinkDTO> findByUid(String uid);
    Optional<LinkDTO> findByUrlOriginal(String urlOriginal);
}