package com.iteso.calendar;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class DateGrupal {

	public static final int MIN_YEAR; //= 1900;
	public static final int MAX_YEAR; //= 3000;
	
	private int day = 1, month = 1, year = 2017;
	private String monthName = "Enero";
	private int format = 0;

	
//	¿En que momento se inicializan los atributos static? 
//	En el primer uso de la clase
	static {
//		String minYearStr = JOptionPane.showInputDialog("Año minimo: ");
//		String maxYearStr = JOptionPane.showInputDialog("Año minimo: ");
	MIN_YEAR = 1900;
	MAX_YEAR = 3000;
//		MIN_YEAR = Integer.parseInt(minYearStr);
//		MAX_YEAR = Integer.parseInt(maxYearStr);
	}
	
	
	public DateGrupal() {
		Calendar c = Calendar.getInstance();
		setYear (c.get(Calendar.YEAR));
		setMonth(c.get(Calendar.MONTH)+1);
		setDay  (c.get(Calendar.DAY_OF_MONTH));
//		System.nanoTime();
//		System.currentTimeMillis();
	}

	public DateGrupal(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public DateGrupal(int day, int month, int year, int format) {
		this(day, month, year);
		setFormat(format);
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		if(isValidDate(day, this.month, this.year)) this.day = day;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		if(isValidDate(this.day, month, this.year)) {
			this.month = month;
			switch (this.month) {
			case 1:
				this.monthName = "Enero";
				break;
			case 2:
				this.monthName = "Febrero";
				break;
			case 3:
				this.monthName = "Marzo";
				break;
			case 4:
				this.monthName = "Abril";
				break;
			case 5:
				this.monthName = "Mayo";
				break;
			case 6:
				this.monthName = "Junio";
				break;
			case 7:
				this.monthName = "Julio";
				break;
			case 8:
				this.monthName = "Agosto";
				break;
			case 9:
				this.monthName = "Septiembre";
				break;
			case 10:
				this.monthName = "Octubre";
				break;
			case 11:
				this.monthName = "Noviembre";
				break;
			default:
				this.monthName = "Diciembre";
			}
		}
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		if(isValidDate(this.day, this.month, year)) this.year = year;
	}

	public int getFormat() {
		return this.format;
	}

	public void setFormat(int format) {
		if (format >= 0 && format <= 2)
			this.format = format;
	}

	public String getMonthName() {
		return this.monthName;
	}

	public String toString() {
		switch (this.format) {
		case 0:
			return String.format("%02d/%02d/%02d", this.day, this.month, this.year % 100);
		case 1:
			return String.format("%d-%s-%d", this.day, this.monthName.substring(0, 3), this.year);
		default:
			return String.format("%d de %s de %d", this.day, this.monthName.toLowerCase(), this.year);
		}
	}

	public boolean equals(Object o) {
		if (!(o instanceof DateGrupal))
			return false;
		DateGrupal d = (DateGrupal) o;
		return this.day == d.day && this.month == d.month && this.year == d.year;
	}

	public DateGrupal clone() {
		return new DateGrupal(this.day, this.month, this.year, this.format);
	}

	public void next() {
		int dd = this.day;
		int mm = this.month;
		int yy = this.year;
		dd ++;
		if (!isValidDate(dd, mm, yy)) {
			dd = 1;
			mm++;
			if (mm > 12) {
				mm = 1;
				yy++;
			}
		}
		this.day = dd;
		setMonth(mm);  // se utiliza para actualizar el nombre del mes
		this.year = yy;
	}
	
	public static boolean isLeap(int yy) {
		return yy % 400 == 0 	|| 	  yy % 4 == 0 && yy % 100 != 0;
	}
	
	public boolean isLeap() {
		return isLeap(this.year);
	}	
	
	public static boolean isValidDate(int dd, int mm, int yy) {
		if (yy < MIN_YEAR || yy > MAX_YEAR) return false;
		if (mm <        1 || mm >   12) return false;
		if (dd <        1 || dd >   31) return false;
		// 31-jun-2500
		// 29-feb-2020		
		// 31-feb-2020
		if(dd > 30 && (mm == 4 || mm == 6 || mm == 9 || mm == 11)) return false;
		// 29-feb-2017
		// 29-feb-2020
		// 31-feb-2020
		if(mm == 2) {
			if(dd > 29) return false;
			if(dd == 29 && !isLeap(yy)) return false;
		}
		return true;
	}
	
	public void m5(){
		System.out.println("m5 de date");
	}
}
