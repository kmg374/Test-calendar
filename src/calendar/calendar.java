package calendar;

import java.util.Scanner;

public class calendar {

	private final int[] MAX_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysOfMonth(int month) {

		return MAX_Days[month - 1];
		
		/*
		if (month == 1) {
			return 31;
		} else if (month == 2) {
			return 28;
		}
		return 31;
			*/
	}

	public void printcalendar(int year,int month) {
		System.out.printf(" <%4d�� %3d��>\n",year, month);
		System.out.println(" ��  ��     ȭ  ��   ��   ��   ��");
		System.out.println(" --------------------");
		
		int maxDay = getmaxDaysOfMonth(month);
		
		for(int i =1; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if(i%7 == 0)
				System.out.println();
		}
		System.out.println();
		
		//System.out.println("1  2   3  4  5  6  7");
		//System.out.println("8  9  10 11 12 13 14");
		//System.out.println("15 16 17 18 19 20 21");
		//System.out.println("22 23 24 25 26 27 28");
	}
}

