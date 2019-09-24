/*
 * Iteration.java
 * By Angel Rosario
 * 841-12-7893
 * 18-marzo-2014
 * Class with with iterative static methods for integer processing.
 */
package algorithms;

public class Iteration {


	// Precondition: n >= 0
	public static long sumUpTo(int n) {

		long sum = 0;

		while ( n > 0) 

			sum += n--;

		return sum;

	}

	public static long factorial(int n) {

		long product = 1;

		while (n > 0) {

			product *= n--;

		}

		return product;

	}

	// Precondition: n >= 0
	public static int gcd(int a, int b){
		while ( b !=  0){
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;

	}

	// Iterative version of Fibonacci
	public static int fibo(int n){

		int fib = 0;

		if (n == 0)
			return 0;

		int a = 0;
		int b = 1;


		for (int i = 2; i <= n; i++){

			fib = a + b;
			a = b;
			b = fib; 
		}

		return b;

	}


}
