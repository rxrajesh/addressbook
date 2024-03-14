package com.rajesh.addressbook.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Contact")
public class Contact {

    @Id
    private Integer id;

    private String firstName;

    private String lastName;

    private String middleInitial;

    List<String> emails;

    @OneToMany(mappedBy = "contact",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference(value="contact-phoneNumber")
    List<PhoneNumber> phoneNumbers;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference(value="contact-address")
    List<Address> addresses;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference(value="contact-group")
    List<ContactGroup> groups;

    LocalDate dob;
}
