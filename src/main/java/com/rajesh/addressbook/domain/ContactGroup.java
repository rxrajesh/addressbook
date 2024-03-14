package com.rajesh.addressbook.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class ContactGroup {

    @Id
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    @JsonBackReference(value="contact-group")
    private Contact contact;

    private String groupName;

    private String groupDescription;
}
