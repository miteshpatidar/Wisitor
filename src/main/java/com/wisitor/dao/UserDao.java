package com.wisitor.dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.wisitor.entities.Usermember;


public class UserDao {
	private Connection con;

	public UserDao(Connection con) {
		super();
		this.con = con;
	}

	public boolean saveUsermember(Usermember user) {
		boolean f = false;
		try {
			String query = "insert into member(membername,memberemail,memberaddress,memberstate,membercity,memberzip,memberphone) values(?,?,?,?,?,?,?);";
			PreparedStatement pstmt = this.con.prepareStatement(query);
			pstmt.setString(1, user.getMembername());
			pstmt.setString(2, user.getMemberemail());
			pstmt.setString(3, user.getMemberaddress());
			pstmt.setString(4, user.getMemberstate());
			pstmt.setString(5,user.getMembercity());
			pstmt.setString(6, user.getMemberzip());
			pstmt.setString(7,user.getMemberphone());

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public Usermember getUsermember(String userEmail) {
		
		try {
			String query = "select * from member where memberemail = ?;";
			PreparedStatement pstmt = this.con.prepareStatement(query);
			pstmt.setString(1, userEmail);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
			String membername = rs.getString(1);
			String memberemail = rs.getString(2);
			String memberaddress = rs.getString(3);
			String memberstate = rs.getString(4);
			String membercity = rs.getString(5);
			String memberzip = rs.getString(6);
			String memberphone = rs.getString(7);
			
			Usermember user = new Usermember(membername, memberemail, memberaddress, memberstate, membercity, memberzip, memberphone);  
			return user;
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
