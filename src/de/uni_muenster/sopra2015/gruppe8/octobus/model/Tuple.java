package de.uni_muenster.sopra2015.gruppe8.octobus.model;

/**
 * Used to group two objects.
 */
public class Tuple<X, Y>
{
	protected X first;
	protected Y second;

	public Tuple(X first, Y second)
	{
		this.first = first;
		this.second = second;
	}

	public X getFirst()
	{
		return first;
	}

	public Y getSecond()
	{
		return second;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
			return false;
		if (o == null || getClass() != o.getClass())
			return false;

		Tuple tuple = (Tuple) o;

		if (first != null ? !first.equals(tuple.getFirst()) : tuple.first != null) return false;
		if (second != null ? !second.equals(tuple.getSecond()) : tuple.second != null) return false;

		return true;
	}

	@Override
	public String toString()
	{
		return "(" + first.toString() + "," + second.toString() + ")";
	}
}
