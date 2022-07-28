package uebung10;

import java.util.Arrays;

public class Sortierverfahren {

	public static void main(String[] args) {

		int[] arrayA = { 8, 16, 3, 12, 2, 9 };
//		int[] arrayA = { 6, 5, 4, 3, 2, 1 };
		int[] arrayB = { 15, 10, 13, 18, 4, 8 };

		bubblesort(arrayA);
		insertsort(arrayB);
	}

	public static void bubblesort(int[] a) {
		System.out.println("\nListe vor BubbleSort: " + Arrays.toString(a) + "\n");
		int temp;
		int verglResult = 0;
		int verscResult = 0;

		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					verscResult = verscResult + 3;
				}
				++verglResult;
				System.out.println(Arrays.toString(a) + " ->    NV");
			}

		}
		System.out.println("\nListe nach BubbleSort: " + Arrays.toString(a));
		System.out.println("Vergleiche: " + verglResult);
		System.out.println("Verschiebungen: " + verscResult);
	}

	public static void insertsort(int[] a) {
		System.out.println("\nListe vor InsertSort: " + Arrays.toString(a) + "\n");
		int temp;
		int verglResult = 0;
		int verscResult = 0;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			verscResult++;
			int j = i;
			while (j > 0 && a[j - 1] > temp) {
				System.out.println(Arrays.toString(a));
				verglResult++;
				verscResult++;
				a[j] = a[j - 1];
				j--;
			}
			a[j] = temp;
			verscResult++;
			
			if(j != 0) {
				verglResult++;
			}
			System.out.println(Arrays.toString(a) + " ->   NV");
		}
		System.out.println("\nListe nach InsertSort: " + Arrays.toString(a));
		System.out.println("Vergleiche: " + verglResult);
		System.out.println("Verschiebungen: " + verscResult);
	}

}
