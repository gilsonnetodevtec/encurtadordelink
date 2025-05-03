package com.encurtadordelink.encurtadordelink.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.encurtadordelink.encurtadordelink.Entity.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {
    Optional<Link> findByUid(String uid);
    Optional<Link> findByUrlOriginal(String urlOriginal);
}
