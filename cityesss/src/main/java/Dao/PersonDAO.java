package Dao;
import org.apache.ibatis.exceptions.PersistenceException;
import person.Person;
import java.io.IOException;


public class PersonDAO extends BaseDAO {
    private PersonMapper personMapper;

    public PersonDAO() throws IOException {
        personMapper = sqlSessionFactory.openSession().getMapper(PersonMapper.class);
    }

    public Person getPersonById(int personId) {
        Person person = new Person();
        try {
            person = personMapper.getPersonById(personId);
        } catch (PersistenceException e) {
            e.printStackTrace();
        }
        return person;
    }
}