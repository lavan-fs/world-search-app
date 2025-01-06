package dev.lavan.world.search.repository;

import dev.lavan.world.search.model.Cities;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<Cities, Integer> {


   Page<Cities> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
