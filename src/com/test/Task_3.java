package com.test;

import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Password: ");
		String a = sc.next();

		System.out.print("Confirm Password: ");
		String b = sc.next();
		
		boolean c = b.equals(a);
		if (c == true) {
			System.out.println("Output: Password Correct");
		} else {
			System.out.println("Output: Password InCorrect");
		}

	}
}

 