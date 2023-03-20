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

//		TODO - if x = 0 - return 1;
		double sum = x;
		int i = 2;

		while (i < sum) {

			if (sum % i == 0.0)
				sum /= i;
			else
				return 0;
			i++;
		}

		return (int) sum / 1;
	}
}
