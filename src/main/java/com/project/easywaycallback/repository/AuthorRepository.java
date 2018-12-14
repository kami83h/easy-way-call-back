package com.project.easywaycallback.repository;

import com.project.easywaycallback.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Create by Kami Hassanzadeh on 2018-12-10.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
    List<Author> findAll();
}
