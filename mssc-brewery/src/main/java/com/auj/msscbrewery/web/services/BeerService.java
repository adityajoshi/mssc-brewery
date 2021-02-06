package com.auj.msscbrewery.web.services;

import com.auj.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID id);
}
