package com.sist.homework02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();	//Set은 순서X
		
		set.add("java");
		set.add("Study");
		set.add("eclipse");
		set.add("day1020");
		
		int size = set.size();
		System.out.println("총 객체수:" + size);
		
		Iterator<String> i = set.iterator();	//위의 set변수
		while(i.hasNext()) {					//가져올 객체가 있으면
			String a = i.next();				//1개의 객체 가져옴
			System.out.println(a);
		}
	}

}
