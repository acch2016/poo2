package com.iteso.calendar;
import com.iteso.calendar.DateTime;
//import com.iteso.calendar.DateGrupal; //porque no se usa? es decir que a traves de DateTime? :o
import java.util.Calendar;

public class Millis extends DateTime {
	
	private int milliseconds = 0;
	private long timestamp = 0;

	public Millis() {
		// TODO Auto-generated constructor stub
		super();
		Calendar c = Calendar.getInstance();
		setMilliseconds(c.get(Calendar.MILLISECOND));
	}

	public Millis(int hh, int mi, int ss) {
		super(hh, mi, ss);
		// TODO Auto-generated constructor stub
	}
	
//	At the beginning when the class was created:
//	public Millis(Date d) {
//		super(d);
//	}

	public Millis(Date d) {
		super(d);
		
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
	
	@Override
	public String toString(){
		if(getFormat() == 0)return String.format("[%02d:%02d:%02d.%03d] %02d/%02d/%02d", super.getHours(), super.getMinutes(), super.getSeconds(), this.milliseconds, super.getDay(), super.getMonth(), super.getYear());
		else{
			return "";
		}
	}
	
	@Override
	public void setFormat(int format){
		
	}
	

}
