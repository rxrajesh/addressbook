package com.rajesh.addressbook.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    private  String  streetAddress;

    private  String  city;

    private  String  state;

    private  Integer zip;

    private  String country;
}
