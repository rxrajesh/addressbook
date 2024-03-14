package com.rajesh.addressbook.controller;

import com.rajesh.addressbook.domain.Contact;
import com.rajesh.addressbook.repository.ContactRepository;
import com.rajesh.addressbook.service.ContactService;
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
    private final ContactService contactService;

    @Autowired
    public Controller(ContactRepository contactRepository,
                      ContactService contactService
    ) {
        this.contactRepository = contactRepository;
        this.contactService = contactService;
    }





    @GetMapping(ALLCONTACTS)
    public List<Contact> getAllContacts(){
        return contactRepository.findAll();
    }

    @GetMapping(CONTACTBYID)
    public Contact getContactById(@PathVariable Integer id){
     //   return contactRepository.findById(id);
        return contactService.getFullContactById(id);

    }
    @GetMapping("/addressbook/byID/{id}")
    public Optional<Contact> getContactByIdAlt(@PathVariable Integer id){
        return contactRepository.findById(id);
    }

}
