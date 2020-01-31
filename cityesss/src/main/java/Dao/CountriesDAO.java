package Dao;
import countries.Countries;
import org.apache.ibatis.exceptions.PersistenceException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountriesDAO extends BaseDAO {
    private CountriesMapper countriesMapper;
    public CountriesDAO() throws IOException {
        countriesMapper = sqlSessionFactory.openSession().getMapper(CountriesMapper.class);
    }
    public Countries getCountryById(int countryId) {
        Countries country = new Countries();
        try {
            country = countriesMapper.getCountryById(countryId);
        } catch (PersistenceException e) {
            e.printStackTrace();
        }
        return country;
    }


}