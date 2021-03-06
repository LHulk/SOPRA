package de.uni_muenster.sopra2015.gruppe8.octobus.model;

import java.time.DayOfWeek;
import java.util.LinkedList;

/**
 * Used to store the data of a Connection.
 */
public class Connection
{
	//Quintuple: (startingTime, start StoppingPoint, Route, end StoppingPoint, arrivalTime)
	private LinkedList<Quintuple<Integer, StoppingPoint, Route, StoppingPoint, Integer>> trips;
	private int duration;



	private DayOfWeek startingDay;
	private int time;

	public Connection()
	{
		trips = new LinkedList<>();
	}

	public Connection(LinkedList<Quintuple<Integer, StoppingPoint, Route, StoppingPoint, Integer>> trips, int duration, int time, DayOfWeek startingDay)
	{
		this.trips = trips;
		this.duration = duration;
		this.time = time;
		this.startingDay = startingDay;
	}

	public LinkedList<Quintuple<Integer, StoppingPoint, Route, StoppingPoint, Integer>> getTrips()
	{
		return trips;
	}

	public int getDuration()
	{
		return duration;
	}

	public int getTime()
	{
		return time;
	}

	public DayOfWeek getStartingDay()
	{
		return startingDay;
	}

	/**
	 * Returns total number of transitions needed in connection
	 * @return number of transitions if trips contains more than one Quadruple, -1 otherwise
	 */
	public int getNumberOfTransitions()
	{
		if(trips != null && trips.size() > 0)
			return trips.size()-1;
		else
			return -1;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Connection that = (Connection) o;

		if (duration != that.duration) return false;
		if (time != that.time) return false;
		if (trips != null ? !trips.equals(that.trips) : that.trips != null) return false;

		return true;
	}

    @Override
    public String toString(){
        String result = this.getClass() + ":["
                + this.getTime() + ", "
                + this.getDuration() + ", "
                + this.getNumberOfTransitions() + ", \n";
        for (Quintuple<Integer, StoppingPoint, Route, StoppingPoint, Integer> trip : trips) {
            String tripString = "(" + trip.getFirst() + ", "
                    + trip.getSecond() + ", "
                    + trip.getThird() + ", "
                    + trip.getFourth() + ", "
                    + trip.getFifth() + "), \n";
            result += tripString;
        }
        return result;
    }

}
