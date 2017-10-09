package com.iteso.calendar;

public class Millis extends DateTime {
	
	private int milliseconds;
	private long timestamp;

	public Millis() {
		// TODO Auto-generated constructor stub
	}

	public Millis(int hh, int mi, int ss) {
		super(hh, mi, ss);
		// TODO Auto-generated constructor stub
	}

	public Millis(Date d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public Millis(int hh, int mi, int ss, int dd, int mm, int yy) {
		super(hh, mi, ss, dd, mm, yy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the milliseconds
	 */
	public int getMilliseconds() {
		return milliseconds;
	}

	/**
	 * @param milliseconds the milliseconds to set
	 */
	public void setMilliseconds(int milliseconds) {
		if (0 <= milliseconds && 999 >= milliseconds) this.milliseconds = milliseconds;
	}

	/**
	 * @return the timestamp
	 */
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	

}
