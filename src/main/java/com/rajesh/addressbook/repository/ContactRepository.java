package com.rajesh.addressbook.repository;

import com.rajesh.addressbook.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
