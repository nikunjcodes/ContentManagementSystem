package com.cms.models;
import jakarta.persistence.*;
import lombok.Data;
import  java.util.*;

@Entity
@Table(name = "themes")
@Data
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true)
    private String name;

    private String description;

    @OneToMany(mappedBy = "themes" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Article> articles = new ArrayList<>();

}
