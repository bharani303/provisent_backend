package com.example.provisent_backend.Service;

import com.example.provisent_backend.Model.enroll_page;
import com.example.provisent_backend.Repository.EnrollRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollService {

    @Autowired
    private EnrollRepository enrollRepository;

    // Save enroll data
    public enroll_page saveEnroll(enroll_page enroll) {
        return enrollRepository.save(enroll);
    }

    // Get all enroll data
    public List<enroll_page> getting() {
        return enrollRepository.findAll();
    }
}