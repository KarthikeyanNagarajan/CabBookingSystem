package com.karthik.CabBookingSystem.model;

import com.karthik.CabBookingSystem.strategy.DriverMatchingStrategy;
import com.karthik.CabBookingSystem.strategy.PricingStrategy;

public class Trip
{
	private int tripId;
	private Rider rider;
	private Driver driver;
	private Location srcloc;
	private Location dstLoc;
	private TripStatus status;
	private double price;
	private PricingStrategy pricingStrategy;
	private DriverMatchingStrategy driverMatchingStrategy;

	public Trip(Rider rider, Driver driver, Location srcloc, Location dstLoc, double price,
			PricingStrategy pricingStrategy, DriverMatchingStrategy driverMatchingStrategy)
	{
		this.rider = rider;
		this.driver = driver;
		this.srcloc = srcloc;
		this.dstLoc = dstLoc;
		this.price = price;
		this.pricingStrategy = pricingStrategy;
		this.driverMatchingStrategy = driverMatchingStrategy;
	}

	public int getTripId()
	{
		return tripId;
	}

	@Override
	public String toString()
	{
		return "Trip [tripId=" + tripId + ", rider=" + rider + ", driver=" + driver + ", price=" + price + ", srcloc="
				+ srcloc + ", dstLoc=" + dstLoc + "]";
	}

}
