package com.front;

import java.util.HashMap;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("���","1000��");
		map.put("����","1500��");
		map.put("����","2000��");
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("���ϴ°�");
		String input = sc.next();
		System.out.println(map.get(input));
	}

}
