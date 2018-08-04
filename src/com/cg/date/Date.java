package com.cg.date;

import java.time.LocalDate;
import java.time.Period;

//Program to print the dates and difference between two dates.
public class Date {

	private int d;
	private int m;
	private int y;

	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}

	public boolean isSmaller(Date date) {

		return ((this.y > date.y) ? true
				: (this.y == date.y && this.m > date.m) ? true
						: (this.y == date.y && this.m == date.m && this.d > date.d) ? true : false);
	}

	@Override
	public String toString() {
		return "Date [d=" + d + ", m=" + m + ", y=" + y + "]";
	}

	// Method to find the difference between two dates.
	public int[] difference(Date date) {

		int diff[] = new int[3];
		LocalDate dateArg = LocalDate.of(date.y, date.m, date.d);
		LocalDate dateIns = LocalDate.of(y, m, d);
		Period differ = Period.between(dateArg, dateIns);
		diff[0] = differ.getDays();
		diff[1] = differ.getMonths();
		diff[2] = differ.getYears();

		return diff;
	}

	// Method to find the difference between two dates.
	public int[] difference2(Date date) {
		int diff[] = new int[3];
		LocalDate dateArg = LocalDate.of(date.y, date.m, date.d);
		LocalDate dateIns = LocalDate.of(y, m, d);

		Period differ = Period.between(dateArg, dateIns);
		diff[0] = differ.getDays() + differ.getYears() * 365;
		diff[1] = (differ.getMonths() + differ.getYears() * 12);
		diff[2] = differ.getYears();

		return diff;
	}

	public int getD() {
		return d;
	}

	public int getM() {
		return m;
	}

	public int getY() {
		return y;
	}
}

