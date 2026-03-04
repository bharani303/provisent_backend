package com.example.provisent_backend.Controller;

import com.example.provisent_backend.Model.Contact_page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.provisent_backend.Model.enroll_page;
import com.example.provisent_backend.Service.EnrollService;

import java.util.List;

@RestController
@RequestMapping("/api/enroll")
@CrossOrigin("*")
public class EnrollController {

    @Autowired
    private EnrollService enrollService;

    @PostMapping("/submit")
    public enroll_page saveEnroll(@RequestBody enroll_page enroll) {
        return enrollService.saveEnroll(enroll);
    }
    @GetMapping("enroll/database")
    public List<enroll_page> getenroll(){
        return enrollService.getting();
    }


}