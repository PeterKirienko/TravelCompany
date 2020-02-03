package Dao;

import cities.Cities;
import com.mysql.cj.Session;
import jdk.nashorn.internal.parser.TokenStream;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CitiesDAO extends BaseDAO {
    private static final Logger LOGGER = Logger.getLogger(CitiesDAO.class);
    private CitiesMapper citiesMapper;
    private SqlSession session;

    public static Logger getLogger() {
        return LOGGER;
    }

    public CitiesDAO() throws IOException {
        session = sqlSessionFactory.openSession();
        citiesMapper = session.getMapper(CitiesMapper.class);
    }

    public Cities getCityById(int cityId) {
        Cities city = new Cities();
        try {
            session = sqlSessionFactory.openSession();
            city = citiesMapper.getCityById(cityId);
        } catch (PersistenceException e) {
        } finally {
            ((PooledDataSource) sqlSessionFactory.getConfiguration().getEnvironment().getDataSource()).forceCloseAll();
            LOGGER.error("This is " + city);
        }
        return city;
    }

    public List<Cities> getCitiesByCountryId(int countryId) {
        List<Cities> cities = new ArrayList();

        try {
            session = sqlSessionFactory.openSession();
            cities = citiesMapper.getCitiesByCountryId(countryId);
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
           session.close();
        }
        return cities;

    }


    public void saveCity(Cities city) {
        try {
            session = sqlSessionFactory.openSession();
            session.commit();
            citiesMapper.addCity(city.getName(), city.getCountries_idcountries(), city.getDescription());
            LOGGER.info("Successfully added a city to the database" + city.getName());
        } catch (PersistenceException e) {
            LOGGER.error("Error when adding a city to the database" + e.getStackTrace());
        } finally {
            session.close();
        }
    }
}