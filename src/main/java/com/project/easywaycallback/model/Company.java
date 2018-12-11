package com.project.easywaycallback.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Create by Kami Hassanzadeh on 2018-12-10.
 */
@Entity
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String companyName;
    private String companyPhoneNumber;

    public Company(String companyName, String companyPhoneNumber) {
        this.companyName = companyName;
        this.companyPhoneNumber = companyPhoneNumber;
    }
}
