package util;

import java.util.List;

/*import com.google.common.base.Splitter;
import com.google.common.collect.Lists;*/

public class MatrixUtil {

	public static String[][] createStringMatrixFromArray(List<String> matrixElements, Integer height, Integer width) {
		String[][] result = new String[height][width];
		for(int x = 0; x < height; x++) {
			for(int y = 0; y < width; y++) {
				result[y][x] = matrixElements.get((width*y) + x);
			}
		}
		return result;
	}
	
	public static String[][] createStringMatrixFromString(String matrixElements, Integer height, Integer width) {
		String[][] result = new String[height][width];
		List<String> listOfMatrixElements = createListForMatrix(matrixElements);
		for(int x = 0; x < height; x++) {
			for(int y = 0; y < width; y++) {
				int index = (width*y) + x;
				result[y][x] = listOfMatrixElements.get(index);
			}
		}
		return result;
	}
	
	public static void printMatrix(String[][] matrix, Integer height, Integer width) {
		for(int x = 0; x < height; x++) {
			for(int y = 0; y < width; y++) {
				System.out.print(matrix[y][x] + " ");
			}
			System.out.println();
		}
	}
	
	public static Integer[][] convertFromStringToInteger(String[][] matrix, Integer height, Integer width) {
		Integer[][] result = new Integer[height][width];
		for(int x = 0; x < height; x++) {
			for(int y = 0; y < width; y++) {
				result[x][y] = Integer.valueOf(matrix[x][y]);
			}
		}
		return result;
	}
	
	private static List<String> createListForMatrix(String matrixElements) {
		//return Lists.newArrayList(Splitter.on(" ").split(matrixElements));
		return null;
	}
}
