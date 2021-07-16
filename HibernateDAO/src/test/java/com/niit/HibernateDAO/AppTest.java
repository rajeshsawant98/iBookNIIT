package com.niit.HibernateDAO;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.config.AppConfig;
import com.niit.dao.UserDAO;
import com.niit.model.User;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class)
public class AppTest 
{
	UserDAO userDAO;
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue(userDAO.addUser(new User("Rajesh","rajeshsawant98@gmail.com","Pass@123")));
    }
}