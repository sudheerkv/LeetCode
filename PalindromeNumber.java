public class Solution {
    public boolean isPalindrome(int x) {
		int temp = x;
		int no_of_digits = -1;
		if (x < 0)
			return false;
		while (temp != 0) {
			temp = temp / 10;
			no_of_digits++;
		}

		while (x != 0) {
			int first = x / (int) Math.pow(10.0, (double) no_of_digits);
			int last = x % 10;
			x = (x % (int) Math.pow(10.0, (double) no_of_digits)) / 10;
			no_of_digits -= 2;
			if (first != last)
				return false;
		}
		return true;
	}
}