package levelup.world.domain.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import levelup.world.domain.Country;

public class MockWorldService implements WorldService {
	
	private static Map<Integer, Country> countries = new HashMap<Integer, Country>();
	
	static {
		countries.put(14,   new Country(14,   "Germany",      137847.34,	82046000L,  parseDate("30-nov-2008"),   "Euro"));
		countries.put(48,   new Country(48,   "Ghana",        92098.546,    23837000L,  null,                       "Cedi"));
		countries.put(53,   new Country(53,   "Australia",    2966200.224,  21884000L,  parseDate("04-sep-2009"),   "Australian Dollar"));
		countries.put(73,   new Country(73,   "Greece",       50949.1123,   11257285L,  parseDate("1-jan-2009"),    "Euro"));
		countries.put(122,  new Country(122,  "Georgia",      26900.6575,   4382100L,   parseDate("1-jan-2009"),    "Lari"));
		countries.put(123,  new Country(123,  "New Zealand",  104454.127,   4320300L,   parseDate("4-sep-2009"),    "New Zealand Dollar"));
		countries.put(147,  new Country(147,  "Gambia",       4361.66,    	1705000L,   null,                       "Dalasi"));
		countries.put(149,  new Country(149,  "Gabon",        103347.979,   1475000L,   null,                       "CFA franc"));
	}
	
	private static Date parseDate(String dateString) {
		try {
			return new SimpleDateFormat("dd-MMM-yyyy").parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Override
	public Collection<Country> getAllCountries() {
		return countries.values();
	}

	@Override
	public Country getCountryById(Integer id) {
		Country country = countries.get(id);		
		return country;
	}

	@Override
	public Country getCountryByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCountry(Country country) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCountry(Country country) {
		// TODO Auto-generated method stub

	}

}
