package com.sist.exam03;

import java.util.Scanner;

public class StringTestReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String data;
		System.out.print("���ڿ��� �Է��ϼ���==>");
		data = sc.next();
		data = data.replace("hello", "�ȳ�");
		System.out.println(data);
		
		//System.out.println(data.replace("hello", "�ȳ�"));
	}

}
