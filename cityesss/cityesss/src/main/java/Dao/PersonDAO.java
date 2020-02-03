package Dao;
import com.mysql.cj.xdevapi.Session;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import person.Person;
import java.io.IOException;
import org.apache.log4j.Logger;

public class PersonDAO extends BaseDAO {
    private PersonMapper personMapper;
    public PersonDAO() throws IOException {
        personMapper = sqlSessionFactory.openSession().getMapper(PersonMapper.class);
    }

    public Person getPersonById(int personId) {
        SqlSession session = sqlSessionFactory.openSession();
        Person person = new Person();
        try {
            person = personMapper.getPersonById(personId);
        } catch (PersistenceException e) {
            e.printStackTrace();
            session.close();
        }
        return person;
        }
}
