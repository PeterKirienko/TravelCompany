package Dao;

import java.util.List;

import cities.Cities;

public interface CitiesMapper {

		Cities getCityById(Integer idCities);
	    List <Cities> getCitiesByCountryId(int Countryid );
	    void AddCity(int CountryId, String Name, String Description);
	    
	}

