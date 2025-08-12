package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.entity.Country;
import com.cognizant.spring_learn.repository.CountryRepository;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImplementation implements CountryService{

    @Autowired
    private CountryRepository countryRepository;
    @Override
    public void saveDepartment(Country country)
    {
       countryRepository.save(country);
    }
    @Override
    public List<Country> getCountries()
    {
        return countryRepository.findAll();
    }
    @Override
    public Country getCountry(String code)
    {
        return countryRepository
                .findByCodeIgnoreCase(code)
                .orElseThrow(() -> new CountryNotFoundException());
    }
}
