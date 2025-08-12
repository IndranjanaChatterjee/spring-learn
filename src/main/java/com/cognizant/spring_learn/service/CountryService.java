package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.entity.Country;

import java.util.List;

public interface CountryService {
    public void saveDepartment(Country country);

    public List<Country> getCountries();

    public Country getCountry(String code);
}
