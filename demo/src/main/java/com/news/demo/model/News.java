package com.news.demo.model;
import jakarta.persistence.*;

//import javax.persistence.*;

@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private String author;

    // Getters and Setters
    // Constructors
}

