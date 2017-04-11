package com.newStart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class testDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orac","hr","hr");
			Statement st=con.createStatement();
			String ql="select * from test";
			ResultSet rs= st.executeQuery(ql);
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			// TODO: handle exception
		}
		catch(Exception e){
			System.out.println("error\n"+e);
	}

}
}
