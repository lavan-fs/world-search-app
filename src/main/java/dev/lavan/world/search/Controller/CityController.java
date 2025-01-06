package dev.lavan.world.search.Controller;

import dev.lavan.world.search.Service.CityService;
import dev.lavan.world.search.model.Cities;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
@RequestMapping("/city")
public class CityController {
    private static final Logger logger = LoggerFactory.getLogger(CityController.class);

    @Autowired
    CityService CityServiceObject;
    @GetMapping("/name/{name}")
    public ResponseEntity<List<Cities>> getCityByName(@PathVariable String name, Pageable pageable) {
        Page<Cities> page = CityServiceObject.findByName(name, pageable);
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Total-Size", String.valueOf(page.getTotalElements()));
        headers.add("X-Total-Pages", String.valueOf(page.getTotalPages()));
        headers.add("X-Current-Page", String.valueOf(page.getNumber()));
        headers.add("Access-Control-Expose-Headers", "X-Total-Size, X-Total-Pages, X-Current-Page");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    @GetMapping("/id/{id}")
    public Optional<Cities> getCityById(@PathVariable Integer id) {
        System.out.println("Fetching city with ID: {}"+ id);
        Optional<Cities> city = CityServiceObject.findById(id);
        if (city.isPresent()) {
            System.out.println("City found: {}"+ city.get());
        } else {
            System.out.println("City with ID: {} not found"+ id);
        }
        return city;
    }
}