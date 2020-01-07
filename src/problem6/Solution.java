package problem6;

//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
public class Solution {

    public static void main(String[] args) {

	System.out.println(SumSquareDifference());

    }

    public static long SumSquareDifference() {

	int sumOfSqrs = 0;
	int sum = 0;
	int sqrOfSum = 0;

	for (int i = 1; i <= 100; i++) {
	    sumOfSqrs = sumOfSqrs + (i * i);
	}

	for (int i = 1; i <= 100; i++) {
	    sum = sum + i;
	}

	sqrOfSum = sum * sum;

	return sqrOfSum - sumOfSqrs;

    }
}
