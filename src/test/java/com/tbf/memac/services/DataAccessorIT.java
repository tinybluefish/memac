package com.tbf.memac.services;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Configurator.class})
public class DataAccessorIT {
	
	@Autowired 
	DataAccessor dataAccessor;
	
	@Before
	public void setup() {
	}
	
	@Test
	public void testConnection() {
		assertTrue(dataAccessor.isConnectionOk());
	}
}
