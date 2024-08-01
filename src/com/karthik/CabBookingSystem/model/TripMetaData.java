package com.karthik.CabBookingSystem.model;

public class TripMetaData
{
	private Location srcloc;
	private Location dstLoc;
	private Rating riderRating;
	private Rating driverRating;

	public TripMetaData(Location srcloc, Location dstLoc, Rating riderRating)
	{
		this.srcloc = srcloc;
		this.dstLoc = dstLoc;
		this.riderRating = riderRating;
		this.driverRating = Rating.UNASSIGNED;
	}

	public Rating getRiderRating()
	{
		return riderRating;
	}

	public Rating getDriverRating()
	{
		return driverRating;
	}

	public void setDriverRating(Rating driverRating)
	{
		this.driverRating = driverRating;
	}
}
