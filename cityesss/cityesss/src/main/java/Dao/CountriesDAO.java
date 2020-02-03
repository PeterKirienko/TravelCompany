package Dao;
import countries.Countries;
import org.apache.ibatis.exceptions.PersistenceException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

public class CountriesDAO extends BaseDAO {
    private CountriesMapper countriesMapper;
    private SqlSession session;
        public CountriesDAO() throws IOException {
        countriesMapper = sqlSessionFactory.openSession().getMapper(CountriesMapper.class);
    }
    public Countries getCountryById(int countryId) {
        session = sqlSessionFactory.openSession();
        Countries country = new Countries();
        try {
            country = countriesMapper.getCountryById(countryId);
        } catch (PersistenceException e) {
            e.printStackTrace();
            session.close();
        }
        return country;

    }


}