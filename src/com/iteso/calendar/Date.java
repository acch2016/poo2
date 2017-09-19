

package com.iteso.calendar;

/** This is a Java program that has the methods for showing the date
 * @author alejandrocanale
 * @version 1.0
 */
public class Date {
	
	/* Attributes or "instance variables" ? */
	private int day = 1, month = 1, year = 2017;
	private String monthName = "January";
	private int format = 0;
	
	/*Constructors*/
	
	/** This is the default constructor */
	public Date(){
	}
	
	/** This constructor calls Setters */
	public Date(int day, int month, int year){
		setDay(month,day);
		setMonth(month);
		setYear(year);
	}
	
	/** This constructor calls the previous constructor and sets the format */
	public Date(int day, int month, int year, int format){
		this(day,month,year);
		setFormat(format);
	}
	
	/* Getters and Setters */
	
	/** Getter. Returns the attribute day */
	public int getDay() {
		return day;
	}
	
	/** Setter. The attribute points to the new value if it is on the range of possibilities  */
	public void setDay(int month, int day) {
		if ( 2 == month ) {
			if( day >= 1 && day <= 28 ) this.day = day;
		} else if ( 4 == month || 6 == month || 9 == month || 11 == month ) {
			if( day >= 1 && day <= 30 ) this.day = day;
		} else if ( 1 == month || 3 == month || 5 == month || 7 == month || 8 == month || 10 == month || 12 == month ){
			if( day >= 1 && day <= 31 ) this.day = day;
		}
	}
	
	/** This method is a getter and it return month */
	public int getMonth() {
		return month;
	}
	
	/** Setter. The attribute points to the new value if it is on the range of possibilities  */
	public void setMonth(int month) {
		if( month >= 1 && month <= 12 ) { 
			this.month = month;
			switch (month){
			case  1: this.monthName = "January";  break;
			case  2: this.monthName = "February"; break;
			case  3: this.monthName = "March";    break;
			case  4: this.monthName = "April";    break;
			case  5: this.monthName = "May";      break;
			case  6: this.monthName = "June";     break;
			case  7: this.monthName = "July";     break;
			case  8: this.monthName = "August";   break;
			case  9: this.monthName = "September";break;
			case 10: this.monthName = "October";  break;
			case 11: this.monthName = "November"; break;
			case 12: this.monthName = "December"; break;
			}
//			This next two lines of code were added in order to get requirements of f)
			if ( ( 2 == month ) && ( 29 == this.day || 30 == this.day || 31 == this.day ) ) this.day = 28;
			if ( ( 4 == month || 6 == month || 9 == month || 11 == month ) && ( 31 == this.day ) ) this.day = 30;
		}		
	}
	
	/** This method is a getter and it return year */
	public int getYear() {
		return year;
	}
	
	/** Setter. The attribute points to the new value if it is on the range of possibilities  */
	public void setYear(int year) {
		if( year >= 1900 && year <= 3000 ) this.year = year;
	}
	
	/** Getter and it return format 
	 * @return format */
	public int getFormat() {
		return format;
	}
	
	/** Setter. The attribute points to the new value if it is on the range of possibilities  
	 * @param format */
	public void setFormat(int format) {
		if( format >= 0 && format <= 2 ) this.format = format;
	}
	
	/** Public Getter
	 * @return monthName */
	public String getMonthName() {
		return monthName;
	}
	
	/* Override methods */
	/** public String toString() override method
	 * @return a formated String */
	@Override
	public String toString(){
		if( 0 == format){return String.format("%02d/%02d/%02d",this.day, this.month, this.year);}
		if( 1 == format){return String.format("%d-%s-%d",this.day, this.monthName.substring(0, 3), this.year);}
		return String.format("%d de %s de %d",this.day, this.monthName.toLowerCase(), this.year);
	}
	
	/** This method compares the the two objects' content */
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Date)) return false; 
		Date date = (Date) o;
		return this.day == date.day && this.month == date.month && this.year == date.year; 
	} 
	
	/** This method makes a new copy of the class Date */
	@Override
	public Date clone() {
		return new Date(this.day, this.month, this.year, this.format);
	}
	
	/* Other method */
	/** This method gives the next day */
	public void next(){
		
		if ( 12 == this.month && 31 == this.day) { 
			this.day = 1; this.month = 1; this.year ++; 
			
		} else if ( 2 == this.month && 28 == this.day ) {
			this.day = 1; this.month ++;
			
		} else if (( 4 == month || 6 == month || 9 == month || 11 == month )&&( 30 == this.day )) { 
			this.day = 1; this.month ++;
			
		} else if (( 1 == month || 3 == month || 5 == month || 7 == month || 8 == month || 10 == month )&&( 31 == this.day)) { 
			this.day = 1; this.month ++;
		
		} else {
			this.day ++;
		}
	}

}

	
