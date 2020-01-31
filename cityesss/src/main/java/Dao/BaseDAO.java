package Dao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class BaseDAO {
    SqlSessionFactory sqlSessionFactory;
    Reader reader = null;

    public BaseDAO() throws IOException {
        try {
            reader = Resources.getResourceAsReader("mybatis.config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
