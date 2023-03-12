class pra6c {
	public static void main(String s[]) {
		int a[][] = { { 1, 2 }, { 3, 4 } };
		int b[][] = { { 5, 6 }, { 7, 8 } };
		int d[][] = new int[2][2];
		int i, j, k;
		System.out.println("Matrix A");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("MAtrix B");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("MAtrix A+B");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				for (k = 0; k < 2; k++)
					d[i][j] = d[i][j] + a[i][k] * b[k][j];
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}
}
