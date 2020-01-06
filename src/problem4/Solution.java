package problem4;

//Find the largest palindrome made from the product of two 3-digit numbers.
public class Solution {

    public static void main(String[] args) {

	System.out.println(LargestPalindromeProduct());

    }

    public static int LargestPalindromeProduct() {

	
	int start = 999;
	int end = 999;
	int num = 0;
	int largestPalindrom = 0;
	
	for(int i=100; i<=start; i++) {
	    for(int k=100; k<=end; k++) {
		    num = i * k;
		    if(isPalindrom(num)) {
			if(largestPalindrom<num) {
			    largestPalindrom = num;
			}
		    } 
		}
	}
	
	return largestPalindrom;

    }

    private static boolean isPalindrom(int num) {
	
	String number = Integer.toString(num);
	
	if(number.equals(new StringBuilder(number).reverse().toString())) {
	    return true;
	}
	
	return false;
    }
}
