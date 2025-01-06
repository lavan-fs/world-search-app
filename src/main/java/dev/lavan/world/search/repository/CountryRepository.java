package dev.lavan.world.search.repository;

import dev.lavan.world.search.model.Countries;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Countries, Integer> {

    Optional<Countries> findByName(String name);
}
