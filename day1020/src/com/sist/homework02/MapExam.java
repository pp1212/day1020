package com.sist.homework02;

import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("È«±æµ¿", 95);
		map.put("ÀÌ¼ø½Å", 80);
		map.put("±èÀ¯½Å", 75);
		
		int size = map.size();
		System.out.println("ÃÑ °´Ã¼¼ö:" + size);
		
		System.out.println("È«±æµ¿:" + map.get("È«±æµ¿"));
		
	}

}
