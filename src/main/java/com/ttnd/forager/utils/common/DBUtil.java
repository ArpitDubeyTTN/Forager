package com.ttnd.forager.utils.common;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class DBUtil {
	private DataSource dataSource;
	 
	public DataSource getDataSource() {
	return dataSource;
	}
	 
	public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
	}
	 
	public void initialize(){
	DataSource dataSource = getDataSource();
	try {
	Connection connection = dataSource.getConnection();
	Statement statement = connection.createStatement();
	statement.executeUpdate("CREATE TABLE Greeting (id INTEGER IDENTITY, name VARCHAR(50))");
	statement.close();
	connection.close();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	}
}
