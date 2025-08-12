package com.cognizant.spring_learn.repository;

import com.cognizant.spring_learn.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country,String> {
    Optional<Country> findByCodeIgnoreCase(String code);
}
