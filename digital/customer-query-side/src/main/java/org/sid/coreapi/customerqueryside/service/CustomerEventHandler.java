package org.sid.coreapi.customerqueryside.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.sid.coreapi.customerqueryside.entities.Customer;
import org.sid.coreapi.customerqueryside.repositories.CustomerRepository;
import org.sid.coreapi.events.CustomerCreatedEvent;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor

public class CustomerEventHandler {
    private CustomerRepository customerRepository;
    @EventHandler
    public void on(CustomerCreatedEvent event){
        log.info("************************");
        log.info("CustomerCreatedEvent received");
        Customer customer=new Customer();
        customer.setId(event.getId());
        customer.setName(event.getName());
        customer.setEmail(event.getEmail());
        customerRepository.save(customer);
    }
}
