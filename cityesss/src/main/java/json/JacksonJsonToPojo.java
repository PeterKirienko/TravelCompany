package json;

import cities.Cities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import tours.Tours;

public class JacksonJsonToPojo {

    ObjectMapper mapper;
    public JacksonJsonToPojo() throws JsonParseException, JsonMappingException, IOException {
        mapper = new ObjectMapper();
    }

    public Cities ReadCityFromJson(String filename) throws IOException {
        InputStream fileInputStream = new FileInputStream(filename);
        Cities city = mapper.readValue(fileInputStream, Cities.class);
        fileInputStream.close();

        System.out.println(city.getCities_id());
        System.out.println(city.getName());
        System.out.println(city.getCountries_idcountries());
        System.out.println(city.getDescription());
        return city;
    }

    public Tours ReadTourFromJson(String filename) throws IOException {
        InputStream fileInputStream = new FileInputStream(filename);
        Tours tour = mapper.readValue(fileInputStream, Tours.class);
        fileInputStream.close();

        System.out.println("Tour from file: ");
        System.out.println(tour.getId());
        System.out.println(tour.getLocation());
        System.out.println(tour.getPrice());
        System.out.println(tour.getTransportTypeId());
        return tour;
    }



}
