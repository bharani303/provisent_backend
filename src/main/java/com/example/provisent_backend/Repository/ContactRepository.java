package com.example.provisent_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.provisent_backend.Model.Contact_page;

public interface ContactRepository extends JpaRepository<Contact_page, Long> {
}