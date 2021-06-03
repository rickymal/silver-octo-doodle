package tests;

public class DrawingPage {
	// https://www.hackerrank.com/challenges/drawing-book/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
	static int pageCount(int n, int p) {

		// maxpage

		int nmax_page = (n / 2) + (n % 2);
		System.out.println("Número máximo de páginas: " + n);
		if (n % 2 == 0) {
			nmax_page += 1;
		}

		System.out.println("Número máximo para folhear: " + nmax_page);
		System.out.println("Número da página requisitada: " + p);
		System.out.println("---");

		int direct_count = -1;
		int reversed_count = -1;

		System.out.println("----------------- [ sentido direto] ---------------------");
		direct_count = right_shift(p, nmax_page);
		System.out.println("----------------- [ sentido reserso] --------------------");
		reversed_count = left_shift(n, p, nmax_page);

		return direct_count < reversed_count ? direct_count : reversed_count;
	}

	private static int left_shift(int n, int p, int nmax_page) {
		int reversed_count;
		int actual_page = n;
		for (int i = nmax_page; i > 0; i--) {
			System.out.println("Páginas viradas: " + (nmax_page - i));

			if (actual_page % 2 == 0) {
				System.out.println("página atual: " + actual_page);
				if (actual_page == p) {
					System.out.println("Página encontrada com sucesso!");
					reversed_count = nmax_page - i;
					return reversed_count;

				} else {
					actual_page--;
				}
			} else {
				System.out.println("página atual: " + actual_page);
				System.out.println("página atual: " + (actual_page - 1));
				if (actual_page == p || actual_page - 1 == p) {
					System.out.println("Página encontrada com sucesso!");
					reversed_count = nmax_page - i;
					return reversed_count;
				} else {
					actual_page -= 2;
				}
			}
			System.out.println("---");

		}

		return -1;
	}

	private static int right_shift(int p, int nmax_page) {
		int direct_count;
		int actual_page = 1;
		for (int i = 0; i < nmax_page; i++) {
			System.out.println("Páginas viradas: " + i);

			if (actual_page == 1) {
				System.out.println("página atual: " + actual_page);
				if (actual_page == p) {
					System.out.println("Página encontrada com sucesso!");

					return i;
				} else {
					actual_page++;
				}
			} else {
				System.out.println("página atual: " + actual_page);
				System.out.println("página atual: " + (actual_page + 1));
				if (actual_page == p || actual_page + 1 == p) {
					System.out.println("Página encontrada com sucesso!");
					return i;
				} else {
					actual_page += 2;
				}
			}
			System.out.println("---");

		}
		return -1;
	}

	public static void main(String[] args) {
		int n = 6;
		int p = 2;

		System.out.println("resultado: " + pageCount(n, p));

	}
}
