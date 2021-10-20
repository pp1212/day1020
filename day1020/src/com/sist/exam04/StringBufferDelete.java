package com.sist.exam04;

public class StringBufferDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer data = new StringBuffer("hello java");
		
		data.deleteCharAt(5);
		System.out.println(data);	//hello java -> hellojava 데이터변경됨 
		
		data.delete(3, 5);
		System.out.println(data);	//hellojava -> heljava  데이터변경됨
		
		
	}

}
