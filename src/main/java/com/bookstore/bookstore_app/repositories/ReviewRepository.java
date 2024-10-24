package com.bookstore.bookstore_app.repositories;

import com.bookstore.bookstore_app.models.ReviewModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID> {
}
