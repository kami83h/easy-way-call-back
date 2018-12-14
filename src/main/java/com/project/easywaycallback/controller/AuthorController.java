package com.project.easywaycallback.controller;

import com.project.easywaycallback.model.Author;
import com.project.easywaycallback.model.Company;
import com.project.easywaycallback.repository.AuthorRepository;
import com.project.easywaycallback.repository.CompanyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Create by Kami Hassanzadeh on 2018-12-10.
 */
@Controller
public class AuthorController {

    private CompanyRepository companyRepository;
    private AuthorRepository authorRepository;

    public AuthorController(CompanyRepository companyRepository, AuthorRepository authorRepository) {
        this.companyRepository = companyRepository;
        this.authorRepository = authorRepository;
    }

    @GetMapping(value = {"/", "/index"})
    public String getMessage(Model model){

        for(Author author: authorRepository.findAll()){
            System.out.println(author);
        }

        model.addAttribute("companys", companyRepository.findAll());
        return "index";
    }
}
