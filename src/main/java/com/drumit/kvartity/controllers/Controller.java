package com.drumit.kvartity.controllers;

import com.drumit.kvartity.entities.Address;
import com.drumit.kvartity.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class Controller {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<Address> hello(){
        return addressService.getAllAddresses();
    }
}
