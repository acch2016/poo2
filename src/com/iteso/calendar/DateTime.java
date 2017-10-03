package com.iteso.calendar;

import java.util.Calendar;

public class DateTime extends DateGrupal{
	
	private int seconds, minutes, hours;

	public DateTime() {
		// TODO Auto-generated constructor stub
		super();
		toSystemTime();
	}
	
	public DateTime(int hh, int mi, int ss) {
		super();
		setHours(hh);
		setMinutes(mi);
		setSeconds(ss);
		
	}
	
	public DateTime(Date d) {
		super(d.getDay(),d.getMonth(),d.getYear());
		toSystemTime();
	}
	
	public DateTime(int hh, int mi, int ss, int dd, int mm, int yy) {
		super(dd,mm,yy);
		setHours(hh);
		setMinutes(mi);
		setSeconds(ss);	
	}
	
	public void toSystemTime(){
		Calendar c = Calendar.getInstance();
		setHours(c.get(Calendar.HOUR_OF_DAY));
		setMinutes(c.get(Calendar.MINUTE));
		setSeconds(c.get(Calendar.SECOND));
	}
	
	@Override
	public String toString(){
		if(getFormat() == 0)
			return String.format("[%02d:%02d:%02d] %s", this.hours, this.minutes, this.seconds,
												super.toString());
		else{
			String AmPm = this.hours < 12 ? "AM" : "PM";
			int h12 = this.hours <= 12 ? this.hours : this.hours - 12;
			if(this.hours == 0) h12 = 12;
			return String.format("[%02d:%02d:%02d %s] %s", h12, this.minutes, this.seconds,
															AmPm, super.toString());
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof DateTime))
			return false;
		DateTime dt = (DateTime) o;
		return this.hours == dt.getHours() && this.minutes == dt.getMinutes() && this.seconds == dt.getSeconds() && super.equals(dt);
	}
	
	@Override
	public DateTime clone() {
		return new DateTime(this.hours,this.minutes,this.seconds,this.getDay(),this.getMonth(),this.getYear());
	}
	
	@Override
	public void next() {
		this.seconds++; 
		if(this.seconds > 59) {
			this.seconds = 0;
			this.minutes++;
			if(this.minutes > 59) {
				this.minutes = 0;
				this.hours++;
				if(this.hours > 23) {
					this.hours = 0;
					super.next();
				}
			}
		}	
	}
	
	public DateGrupal toDate(){
		return super.clone(); 
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if( seconds >= 0 && seconds <= 59) this.seconds = seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if( minutes >= 0 && minutes <= 59 )this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if( hours >= 0 && hours <= 12 )this.hours = hours;
	}
	
	
	

}
