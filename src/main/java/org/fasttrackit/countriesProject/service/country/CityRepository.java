package org.fasttrackit.countriesProject.service.country;

import org.fasttrackit.countriesProject.model.country.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}