package com.verasoft.training;

import java.sql.*;

public class DBConnection {
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javatechie";
			String uname = "root";
			String Password = "root";
			Connection  con = DriverManager.getConnection(url, uname, Password);
			System.out.println("DB connection established");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Product_tbl");
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double  price = rs.getInt("price");
				int quantity=rs.getInt("quantity");
				
			System.out.println("product values ID-->"+id+"  name---"+name+" price ----"+price+" Quntity---"+quantity);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//con.close();
		}
		
		
		

	}

}
