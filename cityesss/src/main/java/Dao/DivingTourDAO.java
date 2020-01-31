//package Dao;
//
//import cities.Cities;
//import jdk.nashorn.internal.parser.TokenStream;
//import org.apache.ibatis.exceptions.PersistenceException;
//import tours.DivingTour;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class DivingTourDAO extends BaseDAO {
//    private DivingTourMapper divingTourMapper;
//
//    public DivingTourDAO() throws IOException {
//        divingTourMapper = sqlSessionFactory.openSession().getMapper(DivingTourMapper.class);
//    }
//    public DivingTour getDivingTourById(getIdDivingTour) {
//        DivingTour divingtour = new DivingTour();
//        try {
//            divingtour = divingtourMapper.getDivingTourById(idDivingTour);
//        } catch (PersistenceException e) {
//            e.printStackTrace();
//        }
//        return divingtour;
//    }
//
//    public List<Cities> getCitiesByCountryId(int countryId) {
//        List<Cities> cities = new ArrayList();
//        // session.commit();
//        try {
//            cities = citiesMapper.getCitiesByCountryId(countryId);
//        } catch (PersistenceException e) {
//            e.printStackTrace();
//        }
//        return cities;
//    }
//
//    public void saveCity(Cities city) {
//        citiesMapper.addCity(city.getName(), city.getCountries_idcountries(), city.getDescription());
//    }
//}