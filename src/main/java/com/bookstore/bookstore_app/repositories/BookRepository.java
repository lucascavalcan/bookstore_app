package com.bookstore.bookstore_app.repositories;

import com.bookstore.bookstore_app.models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<BookModel, UUID> {
}
