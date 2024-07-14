package com.literalura.catalog.repository;

import com.literalura.catalog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findByNameContainsIgnoreCase(String name);

    @Query("SELECT a FROM Author a WHERE a.birthYear <= :year AND a.deathYear >= :year")
    List<Author> filterAuthorsByYear(int year);}
