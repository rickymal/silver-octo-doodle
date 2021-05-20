package tests;

import java.util.Arrays;
import java.util.*;

public class CutTheSticks {
	// Complete the cutTheSticks function below.

	static int[] cutTheSticks(int[] arr) {
		List<Integer> lof_stickers = new ArrayList<Integer>();

		while (true) {
			int sticker_counts = 0;
			System.out.println(Arrays.toString(arr));
			System.out.println(sticker_counts);
			System.out.println(lof_stickers.toString());

			// verificar a quantidade de galhos
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					sticker_counts++;
				}
			}

			if (sticker_counts > 0) {
				lof_stickers.add(sticker_counts);
			} else {
				break;
			}

			int min_value = 99;
			// obter o menor valor
			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i] <= 0) {
					if (arr[i + 1] < min_value && arr[i + 1] > 0) {
						min_value = arr[i + 1];
						continue;
					}
				}

				if (arr[i + 1] <= 0) {
					if (arr[i] < min_value && arr[i] > 0) {
						min_value = arr[i];
						continue;
					}
				}

				if (arr[i] < arr[i + 1]) {
					if (arr[i] < min_value && arr[i] > 0) {
						min_value = arr[i];
						continue;
					}
				} else {
					if (arr[i + 1] < min_value && arr[i + 1] > 0) {
						min_value = arr[i + 1];
						continue;
					}
				}
			}

			// fazer a subtração
			int[] n = new int[arr.length];

			for (int i = 0; i < n.length; i++) {

				n[i] = arr[i] - min_value;

				if (n[i] < 0) {
					n[i] = 0;
				}
			}

			arr = n;
		}

		int[] returned_array = new int[lof_stickers.size()];

		for (int i = 0; i < returned_array.length; i++) {
			returned_array[i] = lof_stickers.get(i);
		}

		return returned_array;

	}

	static int[] etc(int[] arr) {

		int sticker_count = 0;
		List<Integer> lof_stickers = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sticker_count++;
			}
		}

		lof_stickers.add(sticker_count);

		while (true) {
			sticker_count = 0;
			int min_value = 99;

			// obter o menor valor

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					if (arr[i] > 0 && arr[i] < min_value) {
						min_value = arr[i];
					} else {
						continue;
					}
				} else {
					if (arr[i + 1] > 0 && arr[i + 1] < min_value) {
						min_value = arr[i + 1];
					} else {
						continue;
					}
				}
			}

			if (min_value == 99) {

				break;
			}

			// subtrair com todos os elementos
			int[] new_array = new int[arr.length];

			for (int i = 0; i < arr.length; i++) {
				new_array[i] = arr[i] - min_value;
				if (new_array[i] > 0) {
					sticker_count++;
				}
			}

			lof_stickers.add(sticker_count);
			System.out.println(Arrays.toString(new_array));
			System.out.println(lof_stickers.toString());

			arr = new_array;

		}

		int[] returned_array = new int[lof_stickers.size()];

		for (int i = 0; i < returned_array.length; i++) {
			returned_array[i] = lof_stickers.get(i);
		}

		return returned_array;
	}

	public static void main(String[] args) {
		System.out.println("Olá mundo");
		//
		int[] content = { 1, 13, 3, 8, 14, 9, 4, 4 };
		// int[] content = { 1, 2, 3, 4, 3, 3, 2, 1 };
		// int[] content = {5,4,4,2,2,8,};
		// int[] content = {1,0,0,0,0,4};
		// int[] content = {1,0,0,-2,-2,4};

		cutTheSticks(content);

	}
}
