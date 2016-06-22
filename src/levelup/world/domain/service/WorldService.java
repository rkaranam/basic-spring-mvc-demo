package levelup.world.domain.service;

import java.util.Collection;

import levelup.world.domain.Country;

public interface WorldService {

	Collection<Country> getAllCountries();

	Country getCountryById(Integer id);

	Country getCountryByName(String name);

	void saveCountry(Country country);

	void deleteCountry(Country country);

}
