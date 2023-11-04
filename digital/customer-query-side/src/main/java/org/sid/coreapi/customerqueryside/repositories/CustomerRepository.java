package org.sid.coreapi.customerqueryside.repositories;

import org.sid.coreapi.customerqueryside.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {
}
