package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.PersonalInfo;
import com.util.MyDButil;

public class InformationDBAccess {

	public int update(PersonalInfo personalInfo)
	{
		int status=0;
		
		Connection con= MyDButil.getConnection();
		
		try {
			PreparedStatement ps=con.prepareStatement("Update personalinfo set mobileNumber=?,numberoftimesrepaired=?,"
					+ "totalamount=? where id=? and where customerName=?");
			
			ps.setString(1,personalInfo.getMobileNumber());
			ps.setInt(2,personalInfo.getNumberOfTimesRepaired());
			ps.setDouble(3,personalInfo.getTotalAmount());
			ps.setString(5,personalInfo.getCustomerName());
			
			status=ps.executeUpdate();
			
			con.close();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	
	public int delete(int id, String customerName)
	
	{
		int status=0;
		
		Connection con=MyDButil.getConnection();
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("delete from personalinfo where id=? and where customerName=?");
			
			ps.setInt(1,id);
			ps.setString(2,customerName);
			
			status=ps.executeUpdate();
			
			con.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public List<PersonalInfo> getAllUser(){
		
		List<PersonalInfo> list=new ArrayList();
		
		Connection con=MyDButil.getConnection();
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("select * from personalinfo");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				PersonalInfo personalInfo=new PersonalInfo();
				
				personalInfo.setId(rs.getInt(1));
				personalInfo.setCustomerName(rs.getString(2));
				personalInfo.setCustomerEmailId(rs.getString(3));
				personalInfo.setMobileNumber(rs.getString(4));
				personalInfo.setAddress(rs.getString(5));
				personalInfo.setModelNumber(rs.getString(6));
				personalInfo.setSerialNumber(rs.getString(7));
				personalInfo.setDamagePartName(rs.getString(8));
				personalInfo.setTotalAmount(rs.getDouble(9));
				personalInfo.setNumberOfTimesRepaired(rs.getInt(10));
				personalInfo.setPurchaseDate(rs.getDate(11));
				personalInfo.setWarrentyDate(rs.getDate(12));
				personalInfo.setAMC(rs.getDouble(13));
				
				list.add(personalInfo);
			}
			
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
		
		
	}
	
}
