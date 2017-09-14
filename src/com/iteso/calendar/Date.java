package com.iteso.calendar;

public class Date {
	
	/* Attributes o instance variables */
	private int day = 1, month = 1, year = 1;
	private String monthName;
	private int format = 0;
	
	/*Constructores*/

	public Date(){
	}
	
	public Date(int day, int month, int year){
		setDay(month,day);
		setMonth(month);
		setYear(year);
	}
	
	public Date(int day, int month, int year, int format){
	}
	
	/* Getters and Setters */

	public int getDay() {
		return day;
	}

	public void setDay(int month, int day) {
		if ( 2 == month ){
			if( day >= 1 && day <= 28 ) this.day = day;
		}
		if ( 4 == month || 6 == month || 9 == month || 11 == month ){
			if( day >= 1 && day <= 30 ) this.day = day;
		}
		if ( 1 == month || 3 == month || 5 == month || 7 == month || 8 == month || 10 == month || 12 == month ){
			if( day >= 1 && day <= 31 ) this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if( month >= 1 && month <= 12 ) this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if( year >= 1900 && year <= 3000 ) this.year = year;
	}

	public int getFormat() {
		return format;
	}

	public void setFormat(int format) {
		this.format = format;
	}

	public String getMonthName() {
		return monthName;
	}
	
	/* Override methods */
	public String toString(){
		return String.format("{day: %d, month: %d, year: %d, format: %d}", 
				              this.day, this.month, this.year, this.format);
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Date)) return false; 
		Date date = (Date) o;
		return this.day == date.day && this.month == date.month && this.year == date.year; 
	} 
	
	/* Other methods */
	public Date clone() {
		return new Date(this.day, this.month, this.year, this.format);
	}
	
	public void next(){
		
	}

}
