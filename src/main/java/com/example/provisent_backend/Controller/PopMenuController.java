package com.example.provisent_backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.provisent_backend.Model.Pop_menu;
import com.example.provisent_backend.Service.PopMenuService;

import java.util.List;

@RestController
@RequestMapping("/api/application")
@CrossOrigin("*")
public class PopMenuController {

    @Autowired
    private PopMenuService popMenuService;

    // POST - Save application
    @PostMapping("/apply")
    public Pop_menu saveApplication(@RequestBody Pop_menu popMenu) {
        return popMenuService.saveApplication(popMenu);
    }

    // GET - Fetch all applications
    @GetMapping("pop_menu/database")
    public List<Pop_menu> getApplications() {
        return popMenuService.getApplications();
    }
}