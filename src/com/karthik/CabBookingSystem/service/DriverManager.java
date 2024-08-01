package com.karthik.CabBookingSystem.service;

import java.util.HashMap;
import java.util.Map;

import com.karthik.CabBookingSystem.model.Driver;

public class DriverManager
{
	private static DriverManager instance;
	private Map<String, Driver> driverMap = new HashMap<>();

	private DriverManager()
	{

	}

	public static DriverManager getInstance()
	{
		if (instance == null)
			instance = new DriverManager();
		return instance;
	}

	public void addDriver(String driverName, Driver driver)
	{
		driverMap.put(driverName, driver);
	}

	public Driver getDriver(String driverName)
	{
		return driverMap.get(driverName);
	}

	public Map<String, Driver> getDriverMap()
	{
		return driverMap;
	}
}
