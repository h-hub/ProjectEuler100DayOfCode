package peoblem2;

//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
public class Solution {

    public static void main(String[] args) {

	System.out.println(EvenFibonacciNumbers(4000000));

    }

    public static int EvenFibonacciNumbers(int limit) {

	int current = 1;
	int prev = 0;
	int next = 0;
	int sum = 0;

	while (next < limit) {

	    if (current == 1) {
		next = 2;
		current = 2;
		prev = 1;
		sum = sum + next;
	    } else {
		next = current + prev;
		prev = current;
		current = next;
		if (next % 2 == 0) {
		    sum = sum + next;
		}
	    }
	}

	return sum;

    }
}
