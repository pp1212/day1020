package com.sist.exam05;

import java.util.Date;

public class System_CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long data = System.currentTimeMillis();
		//현재날짜와 시간의 정보를 밀리세컨으로 읽어옴
				
		System.out.println(data);
		//1634715388012
		//1634715423941(계속 바뀜)
		
		//날짜를 위한 용도로도 사용하지만
		//난수 만들기 용도로도 사용
		
		Date today = new Date(data);
		
		//long data2 = 1634715388012;
		//자바는 정수형의 값이 오면 무조건 int로 취급
		//그래서 int의 범위가 넘었다고 에러
		//정수형값에 long을 표시하기 위해서 접미사 l을 붙임
		
		long data2 = 1634715388012l;
		Date date = new Date(data2);
		
		System.out.printf("지금시간:%d시 %d분 %d초",today.getHours(),today.getMinutes(),today.getSeconds());
		System.out.printf("아까의 시간:%d시 %d분 %d초",date.getHours(),date.getMinutes(),date.getSeconds());
		
	}

}
