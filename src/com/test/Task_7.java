package com.test;

public class Task_7 {

	public static void main(String[] args) {
		
		String s = new String("welcome");

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				continue;

			}else {
				System.out.println("consonants are :"+ch);
			}
count++;

		}
		System.out.println("count of the consonants:"+count);
		
	}
	}


