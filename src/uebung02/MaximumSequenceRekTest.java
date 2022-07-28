package uebung02;

import java.util.Arrays;

public class MaximumSequenceRekTest {

	public static int maxSubSumRec(int a[]) {
		if (a.length == 1) {
//	            if (a[0] < 0)
//	                return 0;
			return a[0];
		}

		int leftSubArray[] = Arrays.copyOfRange(a, 0, a.length / 2);
		int rightSubArray[] = Arrays.copyOfRange(a, a.length / 2, a.length);

		int maxLeftSum = maxSubSumRec(leftSubArray);
		int maxRightSum = maxSubSumRec(rightSubArray);

		int maxLeftArray = maxLeft(leftSubArray);
		int maxRightArray = maxRight(rightSubArray);

		int help[] = { maxLeftSum, maxRightSum, maxLeftArray + maxRightArray };

		return maxValue(help);
	}

	private static int maxLeft(int left[]) {
		int help[] = new int[left.length];

		for (int i = 0; i < left.length; ++i) {
			int result = 0;
			for (int j = left.length - 1; j >= left.length - 1 - i; --j) {
				result += left[j];
			}
			help[left.length - 1 - i] = result;
		}
		return maxValue(help);
	}

	private static int maxRight(int right[]) {
		int help[] = new int[right.length];

		for (int i = 0; i < right.length; ++i) {
			int result = 0;
			for (int j = 0; j <= i; ++j) {
				result += right[j];
			}
			help[i] = result;
		}
		return maxValue(help);
	}

	private static int maxValue(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int a[] = { 4, -3, 5, -2, -1, 2, 6, -2 };
		System.out.println(maxSubSumRec(a));
	}

}
