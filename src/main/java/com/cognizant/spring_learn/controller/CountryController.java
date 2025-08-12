package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.entity.Country;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;


    @PostMapping("/country")
    public void saveCountry(@RequestBody Country country)
    {
        countryService.saveDepartment(country);
    }

    @GetMapping("/")
    public String show()
    {
        return "Hello";
    }

    @GetMapping("/country")
    public List<Country> fetchCountries()
    {
        return countryService.getCountries();
    }

    @GetMapping("/country/{code}")
    public Country getCountries(@PathVariable("code") String code)
    {
        return countryService.getCountry(code);
    }

}
