package problem5;

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?
public class Solution {

    public static void main(String[] args) {

	System.out.println(SmallestMultiple());

    }

    public static long SmallestMultiple() {

	long rslt = 2;
	boolean isDevidedbyAll = false;
	
	while(true) {
	    
	    for(int i=2; i<=20; i++) {
		if(rslt%i == 0) {
		    isDevidedbyAll = true;
		} else {
		    isDevidedbyAll = false;
		    break;
		}
	    }
	    if(isDevidedbyAll) break;
	    rslt++;
	    
	}

	return rslt;

    }
}
