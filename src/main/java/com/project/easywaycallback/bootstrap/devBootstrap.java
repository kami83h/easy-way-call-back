package com.project.easywaycallback.bootstrap;


import com.project.easywaycallback.model.Author;
import com.project.easywaycallback.model.Company;
import com.project.easywaycallback.repository.AuthorRepository;
import com.project.easywaycallback.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Create by Kami Hassanzadeh on 2018-12-10.
 */
@Component
public class devBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public devBootstrap(CompanyRepository companyRepository, AuthorRepository authorRepository) {
        this.companyRepository = companyRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Author kami = new Author("Kami", "Hassanzadeh");

        Company seb = new Company("SEB", "08123");
        Company swedbank = new Company("Swedbank", "12345");
        Company nordea = new Company("Nordea", "8888888");

        authorRepository.save(kami);

        companyRepository.save(seb);
        companyRepository.save(swedbank);
        companyRepository.save(nordea);

    }
}
