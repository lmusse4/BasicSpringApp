package com.library.simplespringapp.model;

import jakarta.persistence.*;


@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @ManyToOne
//    @JoinColumn(name = "author_id")
    private Author author;

    // Constructors, getters, and setters

    public Book() {
    }

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    // Getters and setters omitted for brevity

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
