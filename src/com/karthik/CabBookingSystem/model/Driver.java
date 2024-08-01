package com.karthik.CabBookingSystem.model;

public class Driver
{
	String name;
	boolean isAvailable;
	Rating rating;

	public Driver(String name, Rating rating)
	{
		this.name = name;
		this.rating = rating;
		this.isAvailable = true;
	}

	public String getName()
	{
		return name;
	}

	public boolean isAvailable()
	{
		return isAvailable;
	}

	public Rating getRating()
	{
		return rating;
	}

	public void setAvailable(boolean isAvailable)
	{
		this.isAvailable = isAvailable;
	}
}
