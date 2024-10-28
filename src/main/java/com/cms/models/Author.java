package com.cms.models;
import jakarta.persistence.*;
import lombok.Data;
import java.util.*;
@Entity
@Table(name = "authors")
@Data
public class Author {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false , unique = true)
    private String email;

    private String bio;

    @OneToMany(mappedBy = "author" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Article> articles = new ArrayList<>();


}
