package com.sist.homework02;

import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("ȫ�浿", 95);
		map.put("�̼���", 80);
		map.put("������", 75);
		
		int size = map.size();
		System.out.println("�� ��ü��:" + size);
		
		System.out.println("ȫ�浿:" + map.get("ȫ�浿"));
		
	}

}
