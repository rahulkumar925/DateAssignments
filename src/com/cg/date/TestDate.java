package com.cg.date;

//Test Class.
public class TestDate {

	public static void main(String[] args) {

		Date date1 = new Date(7, 8, 2000);
		Date date2 = new Date(12, 10, 1995);

		int arr[] = date1.difference2(date2);

		System.out.println("Date1: " + date1);
		System.out.println("Date2: " + date2);
		System.out.println("Total days difference is " + arr[0] + "\nTotal months difference is " + arr[1]
				+ "\nTotal Years difference is " + arr[2]);

	}

}

