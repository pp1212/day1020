package com.sist.exam05;

import java.util.Date;

public class PrintCalendarThisMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1부터 31까지를 모두 출력
		//단, 한 줄에는 7개의 숫자만 출력
		
	
		
		Date today = new Date();
		int year = today.getYear();
		int month = today.getMonth();
		
		//이달의 달력을 출력하기 위하여 
		//만약 이달의 1일의 요일이 금요일이라면
		//앞에 빈칸을 5개 출력해 주고 날짜를 출력해야 한다
		//그래서 이달의 1일의 요일을 알기 위하여 이달의 1일의 Date객체를 생성한다
		Date startDate = new Date(year,month,1);
		
		int day = startDate.getDay();	//요일
		System.out.printf("%d년 %d월\n",year+1900,month+1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//그 달의 1일의 요일만큼 빈칸을 출력
		for(int i=1;i<=day;i++) {
			System.out.print("\t");
		}
		
		
		int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//달력의 날짜를 제대로 출력하도록 코드를 수정해 본다
		for(int i=1; i<=lastDate[month] ; i++) {
			System.out.print(i+"\t");
			if((i+day) % 7 == 0) {
				System.out.println();
			}
		}
		
		/*
		for(int i=1;i<=31;i++) {
			System.out.print(i+"\t");
			if((i+day) % 7 == 0) {
				System.out.println();
			}
		}
		*/
		
		
	}

}
