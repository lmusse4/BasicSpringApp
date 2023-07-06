package com.library.simplespringapp.repository;

import com.library.simplespringapp.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
