package com.project.easywaycallback.repository;

import com.project.easywaycallback.model.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Create by Kami Hassanzadeh on 2018-12-10.
 */
public interface CompanyRepository extends CrudRepository<Company, Long> {
    List<Company> findAll();
}
