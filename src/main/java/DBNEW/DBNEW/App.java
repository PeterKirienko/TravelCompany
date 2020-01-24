package DBNEW.DBNEW;
	import org.apache.ibatis.io.Resources;
	import org.apache.ibatis.session.SqlSessionFactory;
	import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Dao.CitiesMapper;
import cities.Cities;

import java.io.IOException;
	import java.io.Reader;
	public class App {
	    public static void main(String[] args) {
	        SqlSessionFactory sqlSessionFactory;
	        CitiesMapper citiesMapper;
	        Reader reader = null;
	        try {
	            reader = Resources
	                    .getResourceAsReader("mybatis.config.xml"); //Читаем файл с настройками подключения и настройками MyBatis
	            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	            citiesMapper = sqlSessionFactory.openSession().getMapper(CitiesMapper.class); //Создаем маппер, из которого и будем вызывать методы getSubscriberById и getSubscribers
	            Cities city = citiesMapper.getCityById(1);
	            System.out.println(city.getName());
	        }
			catch (IOException e) {
				e.printStackTrace();
			}
			catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

