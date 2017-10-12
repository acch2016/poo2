package com.iteso.calendar;

import java.util.Calendar;


public class Millis extends DateTime {
	
	public static final int DAY=5,HOUR=4,MINUTE=3,SECOND=2,MILLISECOND=1; 
	
	private int milliseconds = 0;
	private long timestamp = 0;

	public Millis() {
		super();
		Calendar c = Calendar.getInstance();
		setMilliseconds(c.get(Calendar.MILLISECOND));
		long tstmp = c.getTimeInMillis();
		setTimestamp(tstmp);
	}
	
	public Millis(int dd, int mm, int yy) {
		super(0, 0, 0, dd, mm, yy);
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		c.set(Calendar.DAY_OF_MONTH, dd);
		c.set(Calendar.MONTH, mm-1);
		c.set(Calendar.YEAR, yy);
		long tstmp = c.getTimeInMillis();
		setTimestamp(tstmp);
	}

	public Millis(int hh, int mi, int ss, int dd, int mm, int yy) {
		super(hh, mi, ss, dd, mm, yy);
		setMilliseconds(0);
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, hh);
		c.set(Calendar.MINUTE, mi);
		c.set(Calendar.SECOND, ss);
		c.set(Calendar.MILLISECOND, 0);
		c.set(Calendar.DAY_OF_MONTH, dd);
		c.set(Calendar.MONTH, mm-1);
		c.set(Calendar.YEAR, yy);
		long tstmp = c.getTimeInMillis();
		setTimestamp(tstmp);
	}
	
	public Millis(int hh, int mi, int ss, int ms, int dd, int mm, int yy) {
		super(hh, mi, ss, dd, mm, yy);
		setMilliseconds(ms);
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, hh);
		c.set(Calendar.MINUTE, mi);
		c.set(Calendar.SECOND, ss);
		c.set(Calendar.MILLISECOND, ms);
		c.set(Calendar.DAY_OF_MONTH, dd);
		c.set(Calendar.MONTH, mm-1);
		c.set(Calendar.YEAR, yy);
		long tstmp = c.getTimeInMillis();
		setTimestamp(tstmp);
	}
	
	public Millis(long tstmp) {
		setTimestamp(tstmp);
	}

	/**
	 * @return the milliseconds
	 */
	public int getMilliseconds() {
		return this.milliseconds;
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
		return this.timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(long timestamp) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(timestamp);
		super.setYear(c.get(Calendar.YEAR));
		super.setMonth(c.get(Calendar.MONTH)+1);
		super.setDay(c.get(Calendar.DAY_OF_MONTH));
		super.setHours(c.get(Calendar.HOUR_OF_DAY));
		super.setMinutes(c.get(Calendar.MINUTE));
		super.setSeconds(c.get(Calendar.SECOND));
		setMilliseconds(c.get(Calendar.MILLISECOND));
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString(){
		if( 0 == getFormat() )return String.format("[%02d:%02d:%02d.%03d] %02d/%02d/%02d", 
				super.getHours(), super.getMinutes(), super.getSeconds(), this.milliseconds, 
				super.getDay(), super.getMonth(), super.getYear() %100);
		else if( 1 == getFormat() ){
			return String.format("%s (%03d)",super.toString(),this.timestamp);
		}else{
			return String.format("%s (%03d)",super.toString(),this.timestamp);
		}
	}
	
	public void add(int constant, int offset) {
		
		switch (constant){
		case MILLISECOND:
			this.timestamp += offset;
			setTimestamp(this.timestamp);
			break;
		case SECOND: 
			this.timestamp += offset*1000;
			setTimestamp(this.timestamp);
			break;
		case MINUTE: 
			this.timestamp += offset*60000;
			setTimestamp(this.timestamp);
			break;
		case HOUR: 
			this.timestamp += offset*60*60000;
			setTimestamp(this.timestamp);
			break;
		case DAY: 
			this.timestamp += offset*24*60*60000;
			setTimestamp(this.timestamp);
			break;
		}	
		
	}
	
	public void next() {
		add(Millis.MILLISECOND,1);
	}
	
	public boolean isBefore(Millis millis) {
		return this.timestamp < millis.timestamp; 
	}
	
	public boolean isAfter(Millis millis) {
		return this.timestamp > millis.timestamp; 
	}
	
	public static long timestampOf(DateTime dt) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, dt.getHours());
		c.set(Calendar.MINUTE, dt.getMinutes());
		c.set(Calendar.SECOND, dt.getSeconds());
		c.set(Calendar.MILLISECOND, 0);
		c.set(Calendar.DAY_OF_MONTH, dt.getDay());
		c.set(Calendar.MONTH, dt.getMonth()-1);
		c.set(Calendar.YEAR, dt.getYear());
		return c.getTimeInMillis();
	}
	
	public static long timestampOf(Date d) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		c.set(Calendar.DAY_OF_MONTH, d.getDay());
		c.set(Calendar.MONTH, d.getMonth()-1);
		c.set(Calendar.YEAR, d.getYear());
		return c.getTimeInMillis();
	}


}
