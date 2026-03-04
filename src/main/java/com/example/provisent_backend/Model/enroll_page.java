package com.example.provisent_backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pop_menu")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class enroll_page {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String phoneNumber;

    private String emailAddress;

    private String degree;

    private String collegeName;

    private String batchYear;

    private String courseName;

    private String modeOfStudy;
}