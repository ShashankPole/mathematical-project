package com.mathprograms;

import java.util.Scanner;

public class Maths {
	Scanner scan = new Scanner(System.in);

	static int p;
	static int g;
	static int k;


	public void maths(int n, int m) {
		g = n;
		k = m;

		System.out.println("press 1 to Addition");
		System.out.println("press 2 to Multiplication");
		System.out.println("press 3 to Division");
		System.out.println("press 4 to Subtraction");

		p = scan.nextInt();

		AddAndSub as = new AddAndSub();
		MulAndDiv md = new MulAndDiv();
		
		if (p == 1) {
			as.add(g, k);
		} else if (p == 2) {
			md.mul(g, k);
		} else if (p == 3) {
			md.div(g, k);
		} else if(p == 4) {
			as.sub(g, k);
		}
		
	}

}
