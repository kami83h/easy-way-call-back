package com.project.easywaycallback.service;

import com.project.easywaycallback.model.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Create by Kami Hassanzadeh on 2018-12-10.
 */
public interface CompanyService extends CrudRepository<Company, Long> {
    List<Company> findAll();
}
