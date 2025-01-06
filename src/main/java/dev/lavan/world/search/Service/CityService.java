package dev.lavan.world.search.Service;

import dev.lavan.world.search.model.Cities;
import dev.lavan.world.search.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    @Autowired
    private CityRepository cityrepo;

    public Page<Cities> findByName(String name, Pageable pageable){
        System.out.printf("Fetching city with name: %s", name);
        return cityrepo.findByNameContainingIgnoreCase(name,pageable);
    }

    public Optional<Cities>findById(Integer id){
        return cityrepo.findById(id);
    }
}
