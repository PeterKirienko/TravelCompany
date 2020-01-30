package Dao;

import cities.Cities;
import com.mysql.cj.Session;
import jdk.nashorn.internal.parser.TokenStream;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CitiesDAO extends BaseDAO {
    private CitiesMapper citiesMapper;
    private SqlSession session;

    public CitiesDAO() throws IOException {
        session = sqlSessionFactory.openSession();
        citiesMapper = session.getMapper(CitiesMapper.class);
    }

    public Cities getCityById(int cityId) {
        Cities city = new Cities();
        try {
            city = citiesMapper.getCityById(cityId);
        } catch (PersistenceException e) {
            e.printStackTrace();
        }
        return city;
    }

    public List<Cities> getCitiesByCountryId(int countryId) {
        List<Cities> cities = new ArrayList();

        try {
            cities = citiesMapper.getCitiesByCountryId(countryId);
        } catch (PersistenceException e) {
            e.printStackTrace();
        }
        return cities;
    }

    public void saveCity(Cities city) {
        citiesMapper.addCity(city.getName(), city.getCountries_idcountries(), city.getDescription());
        session.commit();
    }
}