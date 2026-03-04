package com.example.provisent_backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.provisent_backend.Model.Pop_menu;
import com.example.provisent_backend.Repository.PopMenuRepository;

import java.util.List;

@Service
public class PopMenuService {

    @Autowired
    private PopMenuRepository popMenuRepository;

    // Save data
    public Pop_menu saveApplication(Pop_menu popMenu) {
        return popMenuRepository.save(popMenu);
    }

    // Get all data
    public List<Pop_menu> getApplications() {
        return popMenuRepository.findAll();
    }
}