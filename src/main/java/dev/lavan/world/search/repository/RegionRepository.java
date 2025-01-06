package dev.lavan.world.search.repository;



import dev.lavan.world.search.model.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegionRepository extends JpaRepository<Regions, Integer> {
    Optional<Regions> findByName(String name);



}
