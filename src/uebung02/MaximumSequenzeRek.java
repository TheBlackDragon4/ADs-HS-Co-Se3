package uebung02;

import java.util.Arrays;

public class MaximumSequenzeRek {

	public static int maxSubSumRec(int[] a) {

		// Basisfall: Array der Länge 1
		if (a.length == 1) {
			return a[0];
		}

		// Halbiere Array in linkes und rechtes Teilarray
		// Berechne rekursiv max Sub Wert jeder Hälfte
//		int linkesTeilarray[] = new int[a.length / 2];
//		for (int i = 0; i < a.length / 2; i++) {
//			linkesTeilarray[i] = a[i];
//		}
//		int rechtesTeilarray[] = new int[a.length / 2];
//		int startWert = 0;
//		for (int i = (a.length / 2); i < right + 1; i++) {
//			rechtesTeilarray[startWert++] = a[i];
//		}

		// Schreibt den Inhalt des Arrays von 0 bis zur Hälfte in ein neues Array rein
		int linkesTeilarray[] = Arrays.copyOfRange(a, 0, a.length / 2);
		// Schreibt den Inhalt des Arrays von der Hälfte bis zum SChluss in ein neues
		// Array hinein
		int rechtesTeilarray[] = Arrays.copyOfRange(a, a.length / 2, a.length);

		int maxLeftSum = maxSubSumRec(linkesTeilarray);
		int maxRightSum = maxSubSumRec(rechtesTeilarray);

		// Berechnung der maximalen Summe des linken Teilarrays beginnend von der Mitte
		int maxLeftArray = maxLeft(linkesTeilarray);
		// Berechnung der maximalen Summe des rechten Teilarrays beginnend von der Mitte
		int maxRightArray = maxRight(rechtesTeilarray);

		int hilfsArray[] = {maxLeftSum, maxRightSum, maxLeftArray + maxRightArray};
		
		// nimmt den maximalen Wert dieser drei mitgegebenen Summen an
		return maximalerValue(hilfsArray);
	}

	public static int maxLeft(int left[]) {

		int tempArray[] = new int[left.length];

		for (int i = 0; i < left.length; ++i) {

			int result = 0;

			for (int j = left.length - 1; j >= left.length - 1 - i; --j) {
				result += left[j];
			}
			tempArray[left.length - 1 - i] = result;
		}
		return maximalerValue(tempArray);
	}

	public static int maxRight(int right[]) {

		int tempArray[] = new int[right.length];

		for (int i = 0; i < right.length; ++i) {
			int result = 0;
			for (int j = 0; j <= i; ++j) {
				result += right[j];
			}
			tempArray[i] = result;

		}
		return maximalerValue(tempArray);
	}

	public static int maximalerValue(int[] array) {

		int temp = array[0]; // Schreibt Wert aus Array von Position 0 in Variable hinein

		for (int i = 0; i < array.length; i++) {
			if (array[i] > temp) {
				temp = array[i];
			}
		}
		return temp;
	}

//	public static int maximum3(int maxLeftSum, int maxRightSum, int abschnittSumme) {
//
//		if ((maxLeftSum > maxRightSum) && (maxLeftSum > abschnittSumme)) {
//			return maxLeftSum;
//		} else if ((maxRightSum > maxLeftSum) && (maxRightSum > abschnittSumme)) {
//			return maxRightSum;
//		} else {
//			return abschnittSumme;
//		}
//	}

	public static void main(String[] args) {

//		int array[] = { 4, -3, 5, -2, -1, 2, 6, -2 };
		int array[] = { 3, -4, 2, 2, -3, 1, 3, -2 };
//		int array1[] = { 4 };

		// Vorgegebener Aufruf
		System.out.println(maxSubSumRec(array));

	}

}
