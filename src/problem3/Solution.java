package problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.LongStream;

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?
public class Solution {

    public static void main(String[] args) {

	System.out.println(LargestPrimeFactor(600851475143L));

    }

    public static long LargestPrimeFactor(long limit) {

	long pf = 0;
	long i = 2;
	var primes = new ArrayList<Long>();

	while (true) {

	    if (limit == 1) {
		break;
	    }

	    if (isPrime(i) & limit % i == 0) {
		limit = limit / i;
		primes.add(i);
	    } else {
		i++;
	    }

	}

	return Collections.max(primes);

    }

    private static boolean isPrime(long number) {
	return LongStream.rangeClosed(2, (long) (Math.sqrt(number))).filter(n -> (n & 0X1) != 0)
		.allMatch(n -> number % n != 0);
    }
}
