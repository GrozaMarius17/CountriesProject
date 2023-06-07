package org.fasttrackit.countriesProject.service.country;

import org.fasttrackit.countriesProject.model.country.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
}
