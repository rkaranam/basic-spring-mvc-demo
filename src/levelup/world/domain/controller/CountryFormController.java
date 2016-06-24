package levelup.world.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import levelup.world.domain.Country;
import levelup.world.domain.service.MockWorldService;
import levelup.world.domain.service.WorldService;

@Controller
@RequestMapping("/countryForm.html")
@SessionAttributes("country")
public class CountryFormController {
	
	private WorldService worldService = new MockWorldService();
	
	@RequestMapping(method = RequestMethod.GET)
	public Country setUpForm(@RequestParam(name = "id", required = false) Integer countryId) {
		return worldService.getCountryById(countryId);		
	}

}
