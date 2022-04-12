package com.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Office {
	
	@Id
	@Email()
	private String adminemailId;
	@NotNull()
	private String adminName;
	@Size(min=10,max=300)
	private String location;
	@Size(min=10,max=11)
	private String mobile;
	@NotNull
	private String floorDeatils;
	@Size(min=1,max=300)
	private int  seatingCapacity;
	
	public Office()
	{
		
	}

	public String getAdminemailId() {
		return adminemailId;
	}

	public void setAdminemailId(String adminemailId) {
		this.adminemailId = adminemailId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFloorDeatils() {
		return floorDeatils;
	}

	public void setFloorDeatils(String floorDeatils) {
		this.floorDeatils = floorDeatils;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	
	
	
	

}
