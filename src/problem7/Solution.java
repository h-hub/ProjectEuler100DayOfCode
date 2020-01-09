package problem7;

import java.util.stream.LongStream;

//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class Solution {

    public static void main(String[] args) {

	System.out.println(SumSquareDifference(10001L));

    }

    public static long SumSquareDifference(long whichPrimeNum) {
	

	long primeNumPos = 0;
	long primeNum = 2L;

	while(true) {
	    if(isPrime(primeNum)) {
		primeNumPos++;
	    }
	    
	    if(primeNumPos==whichPrimeNum) break;
	    
	    primeNum++;
	    
	}
	
	return primeNum;

    }
    
    private static boolean isPrime(long x) {
        return LongStream.rangeClosed(2, (long) (Math.sqrt(x)))
            .allMatch(n -> x % n != 0);
    }
}
