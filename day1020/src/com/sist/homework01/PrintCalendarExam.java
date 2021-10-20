package com.sist.homework01;

import java.util.Date;
import java.util.Scanner;

public class PrintCalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int year,month;
		System.out.print("년도를 입력하세요==>");
		year = sc.nextInt();
		System.out.print("월을 입력하세요==>");
		month = sc.nextInt();
		
		//입력한 년,월의 1일
		//Date는 -1900으로 년도 따지기 때문에 입력한 year 값-1900
		//Date는 0부터 월을 세기 때문에 입력한 month 값 -1
		Date startDate = new Date(year-1900, month-1, 1);		
		
		
		int day = startDate.getDay();					//getDay로 요일(정수) 구하기
		System.out.printf("%d년 %d월\n",year,month);		//년,월 출력
		System.out.println("일\t월\t화\t수\t목\t금\t토");	//요일 한 줄 출력
		
		//그 달의 1일의 요일(정수)만큼 탭! 요일은 0부터 시작하니깐 시작을 1부터 하고 요일(정수)까지 반복
		for(int i=1 ; i<=day ; i++) {					
			System.out.print("\t");
		}
		
		//배열에 각 월의 마지막 날짜
		int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		
		
		//Date는 0부터 월을 세기 때문에 입력한 month 값 -1
		//1~해당 월의 마지막 날짜까지 출력하는데, 
		//미리 1일의 시작일만큼 띄어쓰기 한 숫자 더해서 나누기 7 했을 때 7로 나눠지면 줄바꿈
		for(int i=1 ; i<=lastDate[month-1] ; i++) {
			System.out.print(i + "\t");
			if((i + day)%7 == 0) {
				System.out.println();
			}
		}
	}

}
