package com.test;

import java.util.Scanner;

public class Task_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter mail id: ");
		String words = sc.next();

		boolean c = words.contains("@");

		// System.out.println(c);
		if (c == true) {
			System.out.println("valid email Id");
		} else {
			System.out.println("Not Valid");
		}
	}

}
 