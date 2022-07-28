package uebung02;

public class Permutation {

	public char[] str;

	public static void permute(String str) {

		if (str.length() == 2) {

		}

	}

	// Soll alle Permutationen für den String ausgeben -> Sysout
	private void permute(char[] str, int startPos) {

		for (int i = startPos; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

	public static void main(String[] args) {

		permute("abc");

	}

}
