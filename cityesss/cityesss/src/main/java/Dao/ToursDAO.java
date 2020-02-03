package Dao;
import cities.Cities;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import tours.Tours;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ToursDAO extends BaseDAO {
    private ToursMapper toursMapper;

    public ToursDAO() throws IOException {
        toursMapper = sqlSessionFactory.openSession().getMapper(ToursMapper.class);
    }

    public Tours getTourById(int tourId) {
        Tours tour = new Tours();
        try {
            tour = toursMapper.getTourById(tourId);
        } catch (PersistenceException e) {
            e.printStackTrace();
        }
        return tour;
    }

    public List<Tours> getAllTours() {
        List<Tours> allTours = new ArrayList();

        try {

            allTours = toursMapper.getAllTours();
        } catch (PersistenceException e) {
            e.printStackTrace();
            ((PooledDataSource)sqlSessionFactory.getConfiguration().getEnvironment().getDataSource()).forceCloseAll();
        }
        return allTours;
    }
}