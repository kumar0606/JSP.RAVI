package basic_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_connection {
public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	try {
		// Register the driver
		Class.forName("Com.mysql.cj.jdbc.Driver");
		
//		Create Connection
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/databasename");
		
//		Create Statement
		statement=connection.createStatement();
		 //Excute the query
		statement.executeUpdate("INSERT INTO EMPLOYE TABLE VALUES(101,'ravi','ravi@gmail.com'");
		System.out.println("success.....!!!");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		connection.close();
		statement.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
