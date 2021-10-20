package com.sist.exam03;

public class StringTestValueOf {

	public static void pro(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//위와 같이 어떠한 메소드는 String만 매개변수로 갖는 메소드가 있다고 한다면
		
		int data = 2021;
		
		//정수현 데이터 data를 갖고 pro를 호출해야 하는 상황이라고 가정함
		//pro는 String을 매개변수로 갖기 때문에 바로 호출할 수 없고
		//data를 String으로 변환해야 함
		//pro(data);
		pro(String.valueOf(data));
		pro(data + "");  //위랑 같은 결과 나옴,""안에 빈칸은 넣지말고!!!
		
		
	}

}
