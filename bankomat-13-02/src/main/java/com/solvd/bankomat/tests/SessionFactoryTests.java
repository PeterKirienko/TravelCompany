package com.solvd.bankomat.tests;

import com.solvd.bankomat.dao.SessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class SessionFactoryTests {

    SqlSession session;

    @Test
    public void getSession()
    {
        session = SessionFactory.getSession();
        Assert.assertNotNull(session);
    }

    @AfterTest
    public void cleanup()
    {
        session.close();
    }
}
