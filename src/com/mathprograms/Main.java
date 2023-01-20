package com.mathprograms;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two numbers  ");
		System.out.print("num1 : ");
		int n = scan.nextInt();
		System.out.print("num2 : ");
		int m = scan.nextInt();
		
//		int n = 10;
//		int m = 2;
		
		Maths m1 = new Maths();
		m1.maths(n, m);
		
	}
}
