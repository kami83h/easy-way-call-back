package com.project.easywaycallback.service;

import com.project.easywaycallback.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Create by Kami Hassanzadeh on 2018-12-10.
 */
public interface AuthorService extends CrudRepository<Author, Long> {
    List<Author> findAll();
}
