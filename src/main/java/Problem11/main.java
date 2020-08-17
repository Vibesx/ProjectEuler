package Problem11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import util.MatrixUtil;
import util.ReadFromFile;

public class main {

	private static Integer MATRIX_HEIGHT = 20;
	private static Integer MATRIX_WIDTH = 20;

	public static void main(String[] args) {
		String concatenatedLines = "";
		main solution = new main();
		try {
			concatenatedLines = ReadFromFile.readMatrixString("src/Resources/input_test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[][] matrixString = new String[MATRIX_HEIGHT][MATRIX_WIDTH];
		matrixString = MatrixUtil.createStringMatrixFromString(concatenatedLines, MATRIX_HEIGHT, MATRIX_WIDTH);
		Integer[][] matrix = MatrixUtil.convertFromStringToInteger(matrixString, MATRIX_HEIGHT, MATRIX_HEIGHT);
		System.out.println(solution.calculateSolution(matrix));
	}

	private Integer calculateSolution(Integer[][] matrix) {
		Integer maxProduct = 0;
		for (int i = 0; i < MATRIX_HEIGHT; i++) {
			for (int j = 0; j < MATRIX_WIDTH; j++) {
				maxProduct = verifyMaxProduct(matrix, maxProduct, i, j);
			}
		}
		return maxProduct;
	}

	private Integer verifyMaxProduct(Integer[][] matrix, Integer maxProduct, int i, int j) {
		int verticalProduct = 0;
		int horizontalProduct = 0;
		int leftRightDiagonalProduct = 0;
		int rightLeftDiagonalProduct = 0;
		if (i < MATRIX_HEIGHT - 3) {
			verticalProduct = calculateVerticalLine(matrix, i, j);
		}
		if (j < MATRIX_WIDTH - 3) {
			horizontalProduct = calculateHorizontalLine(matrix, i, j);
		}
		if ((i < MATRIX_HEIGHT - 3) && (j < MATRIX_WIDTH - 3)) {
			leftRightDiagonalProduct = calculateLeftRightDiagonalLine(matrix, i, j);
		}
		if ((i < MATRIX_HEIGHT - 3) && (j > 2)) {
			rightLeftDiagonalProduct = calculateRightLeftDiagonalLine(matrix, i, j);
		}
		if (leftRightDiagonalProduct > maxProduct) {
			maxProduct = leftRightDiagonalProduct;
		}
		if (verticalProduct > maxProduct) {
			maxProduct = verticalProduct;
		}
		if (horizontalProduct > maxProduct) {
			maxProduct = horizontalProduct;
		}
		if (rightLeftDiagonalProduct > maxProduct) {
			maxProduct = rightLeftDiagonalProduct;
		}
		return maxProduct;
	}

	private int calculateLeftRightDiagonalLine(Integer[][] matrix, int i, int j) {
		return matrix[i][j] * matrix[i + 1][j + 1] * matrix[i + 2][j + 2] * matrix[i + 3][j + 3];
	}

	private int calculateRightLeftDiagonalLine(Integer[][] matrix, int i, int j) {
		return matrix[i][j] * matrix[i + 1][j - 1] * matrix[i + 2][j - 2] * matrix[i + 3][j - 3];
	}

	private int calculateVerticalLine(Integer[][] matrix, int i, int j) {
		return matrix[i][j] * matrix[i + 1][j] * matrix[i + 2][j] * matrix[i + 3][j];
	}

	private int calculateHorizontalLine(Integer[][] matrix, int i, int j) {
		return matrix[i][j] * matrix[i][j + 1] * matrix[i][j + 2] * matrix[i][j + 3];
	}
}