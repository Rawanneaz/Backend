package org.sid.ebankingbackeend.repositories;

import org.sid.ebankingbackeend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
