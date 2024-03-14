package com.rajesh.addressbook.service;

import com.rajesh.addressbook.domain.Contact;
import com.rajesh.addressbook.repository.AddressRepository;
import com.rajesh.addressbook.repository.ContactGroupRepository;
import com.rajesh.addressbook.repository.ContactRepository;
import com.rajesh.addressbook.repository.PhoneNumberRepository;
import jakarta.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactService {

    private final ContactRepository contactRepository;
    private final AddressRepository addressRepository;
    private final ContactGroupRepository contactGroupRepository;
    private final PhoneNumberRepository phoneNumberRepository;

    private final EntityManager entityManager;
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ContactService(ContactRepository contactRepository,
                          AddressRepository addressRepository,
                          ContactGroupRepository contactGroupRepository,
                          PhoneNumberRepository phoneNumberRepository,
                          EntityManager entityManager,
                          JdbcTemplate jdbcTemplate
    ) {
        this.contactRepository = contactRepository;
        this.addressRepository = addressRepository;
        this.contactGroupRepository = contactGroupRepository;
        this.phoneNumberRepository = phoneNumberRepository;
        this.entityManager = entityManager;
        this.jdbcTemplate = jdbcTemplate;
    }

    public Contact getFullContactById(Integer contactId) {
        log.info(
                "Fetching Contact, Address, Phone numbers and Groups"
        );
        Contact result = entityManager.createQuery("SELECT person "
                        + " FROM distinct Contact person"
                        + " LEFT JOIN FETCH person.addresses"
                        + " LEFT JOIN FETCH person.groups"
                        + " LEFT JOIN FETCH person.phoneNumbers"
                        + " WHERE person.id= :contactId " ,
                Contact.class)
                .setParameter("contactId", contactId)
                .getSingleResult();
    return result;
    }
}
