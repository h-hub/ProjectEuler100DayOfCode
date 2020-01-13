package problem10;

import java.util.stream.LongStream;

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//Find the sum of all the primes below two million.
public class Solution {

    public static void main(String[] args) {

	System.out.println(summationOfPrimes(2000000L));

    }

    public static long summationOfPrimes(long limit) {
	
	long sum = 0L;
	
	for(long i=2L; i<limit; i++) {
	    if(isPrime(i)) {
		sum = sum + i;
	    }
	}
	return sum;

    }
    
    private static boolean isPrime(long x) {
        return LongStream.rangeClosed(2, (long) (Math.sqrt(x)))
            .allMatch(n -> x % n != 0);
    }
}
