package levelup.world.domain.controller;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import levelup.world.domain.Country;
import levelup.world.domain.service.MockWorldService;
import levelup.world.domain.service.WorldService;

@Controller
public class CountryController {
	
	private WorldService worldService = new MockWorldService();
	
	@RequestMapping("/countryList.html")
	@ModelAttribute("countries")
	public Collection<Country> getCountries() {
		return worldService.getAllCountries();				
	}
	
	@RequestMapping("/countryDetails.html")
	public Country getCountry(@RequestParam(value = "id", required = true) Integer countryId) {
		return worldService.getCountryById(countryId);
	}

}
