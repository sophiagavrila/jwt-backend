package com.javatpoint.LoginLogoutExample.DAO.interfaces;

import java.util.List;

import com.javatpoint.LoginLogoutExample.entity.AdminDetail;

public interface AdminDAO {

	public int saveAdminDetail(AdminDetail adminDetail);
	
	public int adminLogin(String emailId , String password);
	
	public List<AdminDetail> getAdminData();
}
