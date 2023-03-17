package com.qa.maven.beginner;

public class Factorials {

	public int sumFactorial(int i) {

		int sum = i;
		for (int x = i - 1; x >= 1; x--) {

			System.out.print("Sum = " + sum);

			sum *= x;
			System.out.println(" * " + x + " = " + sum);
			System.out.println();
		}

		return sum;
	}

	public int reverseFactorial(int x) {

		int sum = x;
		int i = 1;

		while (i <= x) {

			if (sum % x == 0)
				sum /= x;
			else
				return 0;
			i++;
		}
		return sum;
	}
}
