package com.sist.homework02;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("Study");
		list.add("eclipse");
		list.add("day1020");
		
		int size = list.size();
		System.out.println("�� ��ü��:"+size);
		
		for(int i=0 ; i<list.size() ; i++) {
			String str = list.get(i);		//i�ε����� �ִ� ��ü ����
			System.out.println(i + ":" + str);
		}
	}

}
