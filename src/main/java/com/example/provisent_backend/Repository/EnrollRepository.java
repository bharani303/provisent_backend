package com.example.provisent_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.provisent_backend.Model.enroll_page;

public interface EnrollRepository extends JpaRepository<enroll_page, Long> {
}