package com.rajesh.addressbook.domain;

import jakarta.persistence.Entity;
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
public class Contact {

    private Integer Id;

    private String fistName;

    private String lastName;

    private String middleInitial;

    List<String> emails;

    List<String> phone;

    List<Address> addresses;

    LocalDate dob;
}
