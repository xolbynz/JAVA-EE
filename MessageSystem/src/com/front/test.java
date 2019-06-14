package com.front;

import java.util.HashMap;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("사과","1000원");
		map.put("딸기","1500원");
		map.put("수박","2000원");
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("원하는거");
		String input = sc.next();
		System.out.println(map.get(input));
	}

}
