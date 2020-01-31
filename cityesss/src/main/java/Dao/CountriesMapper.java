package Dao;

import countries.Countries;
import java.util.List;

public interface CountriesMapper {
	Countries getCountryById(int countryId);
//	List<Countries> getAllCountries();
//
//	void addCountry(Integer CountryId,String location, String language,String name,String hymn);
}
