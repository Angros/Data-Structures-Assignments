/*
 * Recursion.java
 * By Angel Rosario
 * 841-12-7893
 * 18-marzo-2014
 * Class with with recursive static methods for integer processing.
 */
package algorithms;

public class Recursion {


	// Precondition: n >= 0
	public static long sumUpTo(int n) {
		if ( n == 0)
			return 0;

		else
			return n + sumUpTo(n - 1);


	}



	// Precondition: n >= 0
	public static long factorial(int n) {

		if ( n== 0 )
			return 1;

		else
			return n * factorial(n - 1);


	}



	// Precondition: n >= 0
	public static int gcd(int a, int b){
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	//Recursive version of Fibonacci
	public static int fibo( int n){

		if (n == 0)
			return 0;

		else if (n == 1)
			return 1;

		else
			return fibo(n - 1) + fibo(n - 2);


	}


}
