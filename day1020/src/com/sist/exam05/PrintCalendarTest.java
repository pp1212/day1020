package com.sist.exam05;

import java.util.Calendar;

public class PrintCalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		
		Calendar startDate = Calendar.getInstance();
		startDate.set(year, month, 1);
		
		int day = startDate.get(Calendar.DAY_OF_WEEK);
		System.out.printf("%d년 %d월\n",year+1900,month+1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1;i<=day;i++) {
			System.out.print("\t");
		}
		
		
		int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		for(int i=1; i<=lastDate[month] ; i++) {
			System.out.print(i+"\t");
			if((i+day) % 7 == 0) {
				System.out.println();
			}
		}
		
		
	}

}
