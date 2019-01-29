package edu.hanyang.yd.number;

public class PrimeNumberGetter {
	private static boolean[] eratosNet(int length) {
		boolean[] isPrimeNumber = new boolean[length + 1];

		for (int i = 0; i <= length; i++) {
			isPrimeNumber[i] = true;
		}

		isPrimeNumber[0] = isPrimeNumber[1] = false;
		for (int i = 2; i * i <= length; i++) {
			if (isPrimeNumber[i]) {
				for (int j = i + i; j <= length; j += i) {
					isPrimeNumber[j] = false;
				}
			}
		}

		return isPrimeNumber;
	}
}
