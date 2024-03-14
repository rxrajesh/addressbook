package com.rajesh.addressbook.controller;

import com.rajesh.addressbook.domain.Contact;
import com.rajesh.addressbook.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static com.rajesh.addressbook.constants.ApiConstants.ALLCONTACTS;
import static com.rajesh.addressbook.constants.ApiConstants.CONTACTBYID;

@RestController
@Slf4j
public class Controller {

    private final ContactRepository contactRepository;

    @Autowired
    public Controller(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }





    @GetMapping(ALLCONTACTS)
    public List<Contact> getAllContacts(){
        return contactRepository.findAll();
    }

    @GetMapping(CONTACTBYID)
    public Optional<Contact> getContactById(@PathVariable Integer id){
        return contactRepository.findById(id);

    }

}
