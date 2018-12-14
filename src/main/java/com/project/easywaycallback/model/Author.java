package com.project.easywaycallback.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * Create by Kami Hassanzadeh on 2018-12-10.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Author implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="author_id")
    private Long id;
    private String firstName;
    private String lastName;

//    @ManyToMany(mappedBy = "authors")
//    private Set<Company> companies  = new HashSet<>();


//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {
//                    CascadeType.PERSIST,
//                    CascadeType.MERGE
//            })
//    @JoinTable(name = "author_companies",
//            joinColumns = { @JoinColumn(name = "author_id") },
//            inverseJoinColumns = { @JoinColumn(name = "company_id") })
//    private Set<Company> companies = new HashSet<>();


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
