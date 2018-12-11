package com.project.easywaycallback.bootstrap;


import com.project.easywaycallback.model.Author;
import com.project.easywaycallback.model.Company;
import com.project.easywaycallback.service.AuthorService;
import com.project.easywaycallback.service.CompanyService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Create by Kami Hassanzadeh on 2018-12-10.
 */
@Component
public class devBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private CompanyService companyRepository;
    private AuthorService authorService;

    public devBootstrap(CompanyService companyRepository, AuthorService authorService) {
        this.companyRepository = companyRepository;
        this.authorService = authorService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author eric = new Author("Eric","Sandburg");
        Company company = new Company("SEB","0771365365");

//        eric.getCompany().add(company);
//        company.getAuthors().add(eric);
//
        companyRepository.save(company);
        authorService.save(eric);
    }
}
