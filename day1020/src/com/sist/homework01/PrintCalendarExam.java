package com.sist.homework01;

import java.util.Date;
import java.util.Scanner;

public class PrintCalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int year,month;
		System.out.print("�⵵�� �Է��ϼ���==>");
		year = sc.nextInt();
		System.out.print("���� �Է��ϼ���==>");
		month = sc.nextInt();
		
		//�Է��� ��,���� 1��
		//Date�� -1900���� �⵵ ������ ������ �Է��� year ��-1900
		//Date�� 0���� ���� ���� ������ �Է��� month �� -1
		Date startDate = new Date(year-1900, month-1, 1);		
		
		
		int day = startDate.getDay();					//getDay�� ����(����) ���ϱ�
		System.out.printf("%d�� %d��\n",year,month);		//��,�� ���
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");	//���� �� �� ���
		
		//�� ���� 1���� ����(����)��ŭ ��! ������ 0���� �����ϴϱ� ������ 1���� �ϰ� ����(����)���� �ݺ�
		for(int i=1 ; i<=day ; i++) {					
			System.out.print("\t");
		}
		
		//�迭�� �� ���� ������ ��¥
		int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		
		
		//Date�� 0���� ���� ���� ������ �Է��� month �� -1
		//1~�ش� ���� ������ ��¥���� ����ϴµ�, 
		//�̸� 1���� �����ϸ�ŭ ���� �� ���� ���ؼ� ������ 7 ���� �� 7�� �������� �ٹٲ�
		for(int i=1 ; i<=lastDate[month-1] ; i++) {
			System.out.print(i + "\t");
			if((i + day)%7 == 0) {
				System.out.println();
			}
		}
	}

}
