package com.iteso.calendar;
import com.iteso.calendar.DateTime;
//import com.iteso.calendar.DateGrupal; //porque no se usa? es decir que a traves de DateTime? 
import java.util.Calendar;

//import java.util.Date;
//import java.sql.Timestamp;


public class Millis extends DateTime {
	
	public static final int DAY=5,HOUR=4,MINUTE=3,SECOND=2,MILLISECOND=1; 
	
	private int milliseconds = 0;
	private long timestamp = 0;
//	byte flag_getMs = 0;
//	byte flag_getTs = 0;

//	static {
//		DAY = 0;
//		HOUR = 1; 
//		MINUTE = 2;
//		SECOND = 3; 
//		MILLISECOND = 4; 
//	}

	public Millis() {
		super();
		Calendar c = Calendar.getInstance();
		setMilliseconds(c.get(Calendar.MILLISECOND));
		long tstmp = c.getTimeInMillis();
		setTimestamp(tstmp);
	}

//	public Millis(int hh, int mi, int ss) {
//		super(hh, mi, ss);
//		
//	}
	
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

	
//	At the beginning when the class was created:
//	public Millis(Date d) {
//		super(d);
//	}

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
		setTimestamp(tstmp);// TODO .090]  Instead of .000]  ->  [01:32:43.090] 04/06/11 instead of [01:32:43.000] 04/06/11
	}

	/**
	 * @return the milliseconds
	 */
	public int getMilliseconds() {
//		flag_getMs = 1;
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
//		flag_getTs = 1;
		return this.timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(long timestamp) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(timestamp);
//		c.getTime();
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
//		if( 1 == flag_getMs) {flag_getMs=0; return String.format("ms = %03d",this.milliseconds);}
//		else if( 1 == flag_getTs) {flag_getTs=0; return String.format("ts = %d",this.timestamp);}
		/*else*/ if( 0 == getFormat() )return String.format("[%02d:%02d:%02d.%03d] %02d/%02d/%02d", 
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
	
	static long timestampOf(DateTime dt) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, dt.getHours());
		c.set(Calendar.MINUTE, dt.getMinutes());
		c.set(Calendar.SECOND, dt.getSeconds());
		c.set(Calendar.MILLISECOND, 0);
		c.set(Calendar.DAY_OF_MONTH, dt.getDay());
		c.set(Calendar.MONTH, dt.getMonth());
		c.set(Calendar.YEAR, dt.getYear());
		long tstmp = c.getTimeInMillis();
		return tstmp;
	}


}
