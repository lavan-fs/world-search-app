package dev.lavan.world.search.repository;

import dev.lavan.world.search.model.Subregions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubregionRepository extends JpaRepository<Subregions, Integer> {
    Optional<Subregions> findByName(String name);



}
