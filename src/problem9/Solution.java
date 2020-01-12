package problem9;

//There exists exactly one Pythagorean triplet for which a + b + c = 1000.Find the product abc.
public class Solution {

    public static void main(String[] args) {

	System.out.println(SpecialPythagoreanTriplet(1000));

    }

    public static long SpecialPythagoreanTriplet(int sum) {

	int x = 0;
	int y = 0;
	int z = 0;

	for (int a = 1; a < 1000; a++) {
	    for (int b = 1; b < 1000; b++) {
		if ((a + b + Math.sqrt((a * a) + (b * b))) == 1000) {
		    x = a;
		    y = b;
		    z = (int) Math.sqrt((a * a) + (b * b));
		    break;
		}
	    }
	}

	return x * y * z;

    }

}
