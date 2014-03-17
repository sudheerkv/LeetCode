public class Solution {
	public int trap(int[] A) {

		int[] t = new int[A.length];
		int MaxLeft = -1, MaxRight = -1;
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			if (MaxLeft < A[i])
				MaxLeft = A[i];
			t[i] = MaxLeft;
		}
		for (int i = A.length - 1; i >= 0; i--) {
			if (MaxRight < A[i])
				MaxRight = A[i];
			if (t[i] > MaxRight)
				t[i] = MaxRight;
		}
		for (int i = 0; i < A.length; i++) {
			if (t[i] > A[i])
				sum += (t[i] - A[i]);
		}
		return sum;

	}
}