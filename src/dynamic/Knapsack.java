package dynamic;

public class Knapsack {

	public static void zeroOneKnapSack(int[] weight, int[] benefit, int MaxW,
			int Items) {
		int[][] mat = new int[Items + 1][MaxW + 1];
		for (int w = 0; w < MaxW + 1; w++) {
			mat[0][w] = 0;
		}
		for (int i = 0; i < Items + 1; i++) {
			mat[i][0] = 0;
		}
		for (int i = 1; i < Items + 1; i++) {
			for (int w = 1; w < MaxW + 1; w++) {
				if (weight[i] <= w) {
					if (benefit[i] + mat[i - 1][w - weight[i]] > mat[i - 1][w]) {
						mat[i][w] = benefit[i] + mat[i - 1][w - weight[i]];
					} else {
						mat[i][w] = mat[i - 1][w];
					}

				} else {
					mat[i][w] = mat[i - 1][w];
				}
			}
		}

		printMat(mat);
		printItems(mat, weight);
	}

	public static void printItems(int[][] mat, int[] weight) {
		int i = mat.length - 1;
		int k = mat[0].length - 1;
		System.out.println("items taken: ");
		while (i != 0 && k != 0) {
			if (mat[i][k] != mat[i - 1][k]) {
				System.out.print(i + " ");
				i = i - 1;
				k = k - weight[i];
			} else {
				i = i - 1;
			}
		}

	}

	public static void printMat(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[] weight = { 0, 2, 3, 4, 5 };
		int[] benefit = { 0, 3, 4, 5, 6 };
		int MaxW = 5;
		int n = 4;
		zeroOneKnapSack(weight, benefit, MaxW, n);
	}

}
