package tests;

public class FindDigits {
	static int findDigits(int n) {
		char[] number = String.valueOf(n).toCharArray();
		int nof_divisors = 0;

		int[] integger_number = new int[number.length];
		for (int i = 0; i < number.length; i++) {
			integger_number[i] = Integer.valueOf(number[i]);
		}

		for (int i = 0; i < number.length; i++) {
			int converted_number = Integer.parseInt(String.valueOf(number[i]));

			if (converted_number == 0) {
				// nof_divisors++;
				continue;
			}

			boolean isBeauty = (n % converted_number) == 0;

			if (isBeauty) {
				nof_divisors++;
			} else {
				continue;
			}

		}
		return nof_divisors;
	}

	public static void main(String[] args) {

		System.out.println(findDigits(12));
		System.out.println(findDigits(1012));
		System.out.println(findDigits(212));

	}

}
