package com.karthik.CabBookingSystem.service;

import java.util.HashMap;
import java.util.Map;
import com.karthik.CabBookingSystem.model.Rider;

public class RiderManager
{
	private static RiderManager instance;
	private Map<String, Rider> riderMap = new HashMap<>();

	private RiderManager()
	{

	}

	public static RiderManager getInstance()
	{
		if (instance == null)
			instance = new RiderManager();
		return instance;
	}

	public void addRider(String riderName, Rider rider)
	{
		riderMap.put(riderName, rider);
	}

	public Rider getRider(String riderName)
	{
		return riderMap.get(riderName);
	}

	public Map<String, Rider> getRiderMap()
	{
		return riderMap;
	}
}
