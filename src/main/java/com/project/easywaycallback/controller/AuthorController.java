package com.project.easywaycallback.controller;

import com.project.easywaycallback.service.AuthorService;
import com.project.easywaycallback.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Create by Kami Hassanzadeh on 2018-12-10.
 */
@Controller
public class AuthorController {

    @Autowired
    private CompanyService companyRepository;
    @Autowired
    private AuthorService authorService;


    public AuthorController(CompanyService companyRepository, AuthorService authorService) {
        this.companyRepository = companyRepository;
        this.authorService = authorService;
    }

    @GetMapping(value = {"/", "/index"})
    public String getMessage(Model model){

        System.out.println("AuthorList : " +authorService.findAll());
        model.addAttribute("companys", companyRepository.findAll());
        return "index";
    }
}
