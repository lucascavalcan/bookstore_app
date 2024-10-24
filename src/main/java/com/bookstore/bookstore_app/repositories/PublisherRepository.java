package com.bookstore.bookstore_app.repositories;

import com.bookstore.bookstore_app.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {
}
