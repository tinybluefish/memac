package com.tbf.memac.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DataAccessor {

	Logger LOGGER = LoggerFactory.getLogger(DataAccessor.class);
	
    String dbUrl;
	String dbUsername;
	String dbPwd;
	
	@Autowired
    Environment env;
	
	public DataAccessor() {
	}
	
	public boolean isConnectionOk() {
		try {
			LOGGER.info("Checking DB access...");
			PreparedStatement ps = getConnection().prepareStatement("select * from public.control_workflow");
			ps.execute();
			ResultSet rs = ps.getResultSet();
			while (rs.next()) {
				int id = rs.getInt(0);
				String region = rs.getString(1);
				String lbd = rs.getString(2);
				LOGGER.info("Found workflow: " + id + ", " + region + ", " + lbd);
			}
			LOGGER.info("all OK!");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Connection getConnection() {
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR: failed to load HSQLDB JDBC driver.");
			e.printStackTrace();
		}

		try {
			dbUrl = env.getProperty("db.url");
			dbUsername = env.getProperty("db.username");
			dbPwd = env.getProperty("db.password");
			Connection c = DriverManager.getConnection(
					dbUrl, dbUsername, dbPwd);
			
			c.prepareStatement("select 1 from dual");
			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
