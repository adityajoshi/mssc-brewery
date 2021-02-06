package com.auj.msscbrewery.web.services;

import com.auj.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
