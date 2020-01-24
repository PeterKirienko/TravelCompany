package Dao;

import java.util.List;

import cities.Cities;

public interface CitiesMapper {

		Cities getCityById(Integer idCities);
	    List <Cities> getCitiesBYCountryId(int Countryid );
	    void AddCity(int cityId,int Countryid,String Name,String Description);
	    
	}

