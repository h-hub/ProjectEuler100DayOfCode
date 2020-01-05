package problem1;

public class Solution {

    public static void main(String[] args) {

	System.out.println(MultiplesOf3and5(1000));

    }

    public static int MultiplesOf3and5(int limit) {

	int sum = 0;

	for (int i = 0; i < limit; i++) {
	    if (i % 3 == 0 || i % 5 == 0) {
		sum = sum + i;
	    }
	}

	return sum;

    }
}
