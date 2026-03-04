package com.example.provisent_backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.provisent_backend.Model.Contact_page;
import com.example.provisent_backend.Repository.ContactRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact_page saveContact(Contact_page contact) {
        return contactRepository.save(contact);
    }

    public List<Contact_page> getcontact() {
    return contactRepository.findAll();
    }
}