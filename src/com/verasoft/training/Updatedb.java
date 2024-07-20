package com.verasoft.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatedb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// Connection connection = null;
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javatechie";
			String uname = "root";
			String Password = "root";
			Connection con = DriverManager.getConnection(url, uname, Password);
			System.out.println("DB connection established");
			Statement st = con.createStatement();
			int rs = st.executeUpdate("update Product_tbl set name='SAMSUNG1' where id=1");
			System.out.println(rs);
			
			
			}
	}

