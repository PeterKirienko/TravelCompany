package Dao;
import java.util.List;
import countries.Countries;
public interface CountriesMapper {
	    Countries getCountryById(Integer idCountries );
	    List <Countries> getCitiesByCountryId(Integer countryid );
		
	}
