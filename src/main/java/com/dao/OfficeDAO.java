package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Office;

@Repository
public interface OfficeDAO {
	
	public void addOffice(Office office);
	public Office findOffice(String emailId);
	public List<Office> findAllOffice();
	public boolean updateOffice(Office office);
	public boolean deleteOffice(Office office);
	

}
