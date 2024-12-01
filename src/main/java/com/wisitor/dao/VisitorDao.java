package com.wisitor.dao;

import java.sql.Connection;
import com.wisitor.entities.Visitormember;
import 	java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VisitorDao {
	private  Connection con;
	public VisitorDao(Connection con) {
		// TODO Auto-generated constructor stub
		this.con = con;
	}
	
	public boolean saveVisitor(Visitormember visitormember) {
		try{
			String query = "insert into visitor values(?,?,?,?);";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, visitormember.getVisitorname());
			pstmt.setString(2, visitormember.getVisitorphone());
			pstmt.setString(3, visitormember.getVisitorpurpose());
			pstmt.setString(4, visitormember.getMemberemail());
			
			pstmt.executeUpdate();
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	public  ResultSet getVisitor(String memberemail) {
		try {
			String query = "select * from visitor where memberemail = ?;";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1,memberemail);
			
			ResultSet rs = pstmt.executeQuery();
			return rs;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
}
