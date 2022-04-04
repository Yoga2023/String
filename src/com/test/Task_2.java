package com.test;

public class Task_2 {
public static void main(String[] args) {
	String s="MADAM";
	 String b = "";
     

     for ( int i = 4; i >= 0; i-- )
        b = b + s.charAt(i);

     if (s.equals(b))
        System.out.println(s+" is a palindrome");
        
        	else {System.out.println(s+" is not palindrome");
        }
    
}
}
