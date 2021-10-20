package com.sist.exam05;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date today = new Date();
		int year = today.getYear() +1900;
		int month = today.getMonth() +1;
		int date = today.getDate();
		int hours = today.getHours();
		int minutes = today.getMinutes();
		int seconds = today.getSeconds();
		int day = today.getDay();
		
		String []arr = {"일","월","화","수","목","금","토"};
		
		
		String yoil = arr[day];
		//요일을 처리해 본다
		
		//코드에 취소선이 그어지는 것은 지금의 자바버전에서는 Date보다는
		//Calender나 GregorianCalender를 사용하기를 권장하는 것, 무시해도 좋음
		
		System.out.println(day);
		System.out.printf("현재는 %d년 %d월 %d일(%s요일) %d시 %d분 %d초입니다",year,month,date,yoil,hours,minutes,seconds);
	
		
		
		System.out.println("--------------------------------------");
		//이건우는 무슨 요일에 태어났는지 알아보자
		//1995/7/29
		
		
		int birthYear = 1995;
		int birthMonth = 7;
		int birthDate = 29;
		
		Date leeDate = new Date(birthYear-1900, birthMonth-1, birthDate);
		int day2 = leeDate.getDay();
		System.out.printf("이건우가 태어난날은 %s요일입니다",arr[day2]);
		
		
		/*내가 한 것
		Date birth = new Date(95, 6, 29);
		int dayNumber = birth.getDay();
		String birthDay = arr[dayNumber];
		System.out.println(birthDay);
		*/
	}

}
