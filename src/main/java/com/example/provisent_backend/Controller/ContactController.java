package com.example.provisent_backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.provisent_backend.Model.Contact_page;
import com.example.provisent_backend.Service.ContactService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin("*")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/send")
    public Contact_page saveContact(@RequestBody Contact_page contact) {
        return contactService.saveContact(contact);
    }
    @GetMapping("contact/database")
    public List<Contact_page> getcontact(){
        return contactService.getcontact();
    }
}