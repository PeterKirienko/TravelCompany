package DBNEW.DBNEW;
import Dao.CitiesDAO;
import Dao.CountriesDAO;
import Dao.PersonDAO;
import Dao.ToursDAO;
import countries.Countries;
import json.JacksonJsonToPojo;
import json.JacksonPojoToJson;
import cities.Cities;
import person.Person;
import tours.Tours;
import java.io.IOException;
import java.util.List;

public class App {
	public static void main(String[] args) throws IOException {

		JacksonPojoToJson jacksonPojoToJson = new JacksonPojoToJson();
		JacksonJsonToPojo jacksonJsonToPojo = new JacksonJsonToPojo();
		CitiesDAO citiesDAO = new CitiesDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
		PersonDAO personDao = new PersonDAO();
		ToursDAO toursDAO = new ToursDAO();

		// Countries
		Cities city = citiesDAO.getCityById(1);
		jacksonPojoToJson.saveObjectToJsonFile(city, "city2");

		List<Cities> cities = citiesDAO.getCitiesByCountryId(2);
		jacksonPojoToJson.saveObjectToJsonFile(cities, "cities");
		for (Cities town : cities)
		{
			System.out.println(town.getCities_id() + " " + town.getName());
		}

		Cities City = jacksonJsonToPojo.ReadCityFromJson("LondonCity.json");
		citiesDAO.saveCity(City);

		// Countries
		Countries countries = countriesDAO.getCountryById(2);
		jacksonPojoToJson.saveObjectToJsonFile(countries, "countries");

		// Person
		Person person = personDao.getPersonById(4);
		jacksonPojoToJson.saveObjectToJsonFile(person, "person");

		// Tours
		Tours tour = toursDAO.getTourById(6);
		jacksonPojoToJson.saveObjectToJsonFile(tour, "tour");
		List<Tours> allTours = toursDAO.getAllTours();
		jacksonPojoToJson.saveObjectToJsonFile(allTours, "allTours");

		Tours tourFromJson = jacksonJsonToPojo.ReadTourFromJson("LondonTour.json");
	}
}