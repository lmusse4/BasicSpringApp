package com.library.simplespringapp.repository;

import com.library.simplespringapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
