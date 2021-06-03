package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SalesByMatch {

	public static int iterate(int n, List<Integer> ar) {
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				int n1 = ar.get(i);
				int n2 = ar.get(j);
				if (n1 == n2) {
					ar.remove(i);
					ar.remove(j - 1);
					return 1;
				}
			}
		}
		return 0;
	}

	public static int sockMerchant(int n, List<Integer> ar) {
		int nof_pairs = 0;

		while (true) {
			System.out.println("Array: " + ar.toString());
			int r = iterate(n, ar);
			if (r == 1) {
				System.out.println("Incrementando");
				nof_pairs += 1;
			} else {
				System.out.println("breaking");
				break;
			}
		}
		;
		return nof_pairs;

	}

	public static void main(String[] args) {
		System.out.println("OI");
		int n = 9;
		Integer[] a = new Integer[] { 1, 2, 1, 2, 1, 3, 2, };
		// List<Integer> arguments = Arrays.asList(a);
		List<Integer> arguments = new ArrayList<Integer>(Arrays.asList(a)); // convert array to mutable list
		System.out.println(arguments.toString());
		int resultado = sockMerchant(n, arguments);
		System.out.println("O resultado é " + resultado);
	}
}
