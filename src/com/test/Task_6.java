package com.test;

public class Task_6 {
	public static void main(String[] args) {

		// System.out.println(s.length());
		// String s = "Welcome";
		String s = new String("welcome");

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;

			}

		}
		System.out.println("count of the vowels:"+count);
	}
}
