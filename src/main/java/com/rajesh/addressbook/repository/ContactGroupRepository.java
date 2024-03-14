package com.rajesh.addressbook.repository;

import com.rajesh.addressbook.domain.ContactGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactGroupRepository extends JpaRepository<ContactGroup, Integer>
{
}
