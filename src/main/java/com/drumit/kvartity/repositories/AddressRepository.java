package com.drumit.kvartity.repositories;

import com.drumit.kvartity.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
