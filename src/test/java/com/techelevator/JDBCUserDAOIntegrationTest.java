package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techelevator.model.JDBCUserDAO;
import com.techelevator.model.User;

@Component
public class JDBCUserDAOIntegrationTest extends DAOIntegrationTest {

@Autowired	
private JDBCUserDAO userDAO;


	
@Before
public void setup() {
	userDAO = new JDBCUserDAO(dataSource, null);
	String userName = "user";
	String password = "0123456789Abcde";
	userDAO.saveUser(userName, password);
}

@Test 
public void test_registration() {
	String userName = "user";
	String password = "0123456789Abcde";
	boolean results = userDAO.searchForUsernameAndPassword(userName, password);
	assertTrue(results);
	assertNotNull(results);
	assertEquals("user", results);
}

@Test
public void test_login() {
	
}
 




}