package matrix;

import java.util.Scanner;

public class MatrixOperation {
	private static final int COLS = 2, ROWS = 3;

	public static int[][] matrixAddition(int[][] mat1, int[][] mat2) {
		int[][] matSum = new int[mat1.length][mat1[0].length];
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				matSum[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		return matSum;
	}

	public static int[][] matrixSubtract(int[][] mat1, int[][] mat2) {
		int[][] matSum = new int[mat1.length][mat1[0].length];
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				matSum[i][j] = mat1[i][j] - mat2[i][j];
			}
		}
		return matSum;
	}

	public static int[][] matrixProduct(int[][] mat1, int[][] mat2) {

		int[][] matProd = new int[mat1.length][mat2[0].length];
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				for (int k = 0; k < mat1[0].length; k++) {
					matProd[i][j] += mat1[i][k] * mat2[k][j];
				}

			}
		}
		return matProd;
	}

	public static int[][] matrixTranspose(int[][] mat1) {

		int[][] matTrans = new int[mat1[0].length][mat1.length];
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[0].length; j++) {
				matTrans[j][i] = mat1[i][j];

			}
		}
		return matTrans;
	}

	/*
	 * for (int i = 0; i < rowsInFirst; i++) { for (int j = 0; j < colsInSecond;
	 * j++) { for (int k = 0; k < colsInFirstRowsInSecond; k++) { product[i][j]
	 * += matrix1[i][k] * matrix2[k][j]; } } }
	 */

	public static void printMatrix(int[][] matrix) {
		System.out.println("Print Matrix data: \n");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[][] mat1 = new int[2][3];
		int[][] mat2 = new int[3][2];

		System.out.println("First matrix data: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				mat1[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Second matrix data: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				mat2[i][j] = scanner.nextInt();
			}
		}

		printMatrix(mat1);
		printMatrix(mat2);

		int[][] transMat = matrixTranspose(mat1);
		printMatrix(transMat);

		// int[][] addMat = matrixAddition(mat1, mat2);
		//
		// printMatrix(addMat);
		// int[][] subMat = matrixSubtract(mat1, mat2);
		// printMatrix(subMat);
	}

}
