package com.sist.homework02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();	//Set�� ����X
		
		set.add("java");
		set.add("Study");
		set.add("eclipse");
		set.add("day1020");
		
		int size = set.size();
		System.out.println("�� ��ü��:" + size);
		
		Iterator<String> i = set.iterator();	//���� set����
		while(i.hasNext()) {					//������ ��ü�� ������
			String a = i.next();				//1���� ��ü ������
			System.out.println(a);
		}
	}

}
