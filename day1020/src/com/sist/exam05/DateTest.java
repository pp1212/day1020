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
		
		String []arr = {"��","��","ȭ","��","��","��","��"};
		
		
		String yoil = arr[day];
		//������ ó���� ����
		
		//�ڵ忡 ��Ҽ��� �׾����� ���� ������ �ڹٹ��������� Date���ٴ�
		//Calender�� GregorianCalender�� ����ϱ⸦ �����ϴ� ��, �����ص� ����
		
		System.out.println(day);
		System.out.printf("����� %d�� %d�� %d��(%s����) %d�� %d�� %d���Դϴ�",year,month,date,yoil,hours,minutes,seconds);
	
		
		
		System.out.println("--------------------------------------");
		//�̰ǿ�� ���� ���Ͽ� �¾���� �˾ƺ���
		//1995/7/29
		
		
		int birthYear = 1995;
		int birthMonth = 7;
		int birthDate = 29;
		
		Date leeDate = new Date(birthYear-1900, birthMonth-1, birthDate);
		int day2 = leeDate.getDay();
		System.out.printf("�̰ǿ찡 �¾���� %s�����Դϴ�",arr[day2]);
		
		
		/*���� �� ��
		Date birth = new Date(95, 6, 29);
		int dayNumber = birth.getDay();
		String birthDay = arr[dayNumber];
		System.out.println(birthDay);
		*/
	}

}
