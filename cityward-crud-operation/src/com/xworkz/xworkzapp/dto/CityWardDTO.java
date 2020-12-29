package com.xworkz.xworkzapp.dto;

import com.xworkz.xworkzapp.constants.WardName;

public class CityWardDTO {

	private int wardNumber;
	private  WardName wardName;
	private String corporatorName;
	private long population;
	private String areaSqKilometers;
	public int getWardNumber() {
		return wardNumber;
	}
	public void setWardNumber(int wardNumber) {
		this.wardNumber = wardNumber;
	}
	public WardName getWardName() {
		return wardName;
	}
	public void setWardName(WardName basaveshwaranagar) {
		this.wardName = basaveshwaranagar;
	}
	public String getCorporatorName() {
		return corporatorName;
	}
	public void setCorporatorName(String corporatorName) {
		this.corporatorName = corporatorName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public String getAreaSqKilometers() {
		return areaSqKilometers;
	}
	public void setAreaSqKilometers(String areaSqKilometers) {
		this.areaSqKilometers = areaSqKilometers;
	}
	
}
