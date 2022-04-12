package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Office;

@Service
public class OfficeService {
	
	@Autowired
	OfficeDAO OfficeDAOImpl;
	public void add(Office office)
	{
		OfficeDAOImpl.addOffice(office);
	}
	public Office find(String emailId)
	{
		return OfficeDAOImpl.findOffice(emailId);
	}
	public List<Office> findAll()
	{
		return OfficeDAOImpl.findAllOffice();
	}
	public boolean update(Office office)
	{
		return OfficeDAOImpl.updateOffice(office);
	}
	public boolean delete(Office office)
	{
		return OfficeDAOImpl.deleteOffice(office);
	}

}
