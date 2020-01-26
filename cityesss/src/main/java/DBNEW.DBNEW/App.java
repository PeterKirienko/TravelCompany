package DBNEW.DBNEW;
	import org.apache.ibatis.io.Resources;
	import org.apache.ibatis.session.SqlSessionFactory;
	import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Dao.CitiesMapper;
import cities.Cities;

import java.io.IOException;
	import java.io.Reader;
	import java.util.List;

public class App {
	    public static void main(String[] args) {
	        SqlSessionFactory sqlSessionFactory;
	        CitiesMapper citiesMapper;
	        Reader reader = null;
	        try {
	            reader = Resources
	                    .getResourceAsReader("mybatis.config.xml");
	            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	            citiesMapper = sqlSessionFactory.openSession().getMapper(CitiesMapper.class);
	            Cities city = citiesMapper.getCityById(1);
	            System.out.println(city.getName());

				List<Cities> cities = citiesMapper.getCitiesByCountryId(2);
				for (Cities c : cities)
				{
					System.out.println(c.getCities_id() + " " + c.getName());
				}
	        }
			catch (IOException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

