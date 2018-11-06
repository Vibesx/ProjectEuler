package main.java.Problem18;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.java.util.ReadFromFile;

public class Problem18 {

	private static final Integer TRIANGLE_HEIGHT = 15;

	public static void main(String[] args) {
		List<String> input = new ArrayList<String>();
		Integer[][] triangle = new Integer[TRIANGLE_HEIGHT][TRIANGLE_HEIGHT];
		try {
			input = ReadFromFile.readStringAsList("src/Resources/problem18.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < TRIANGLE_HEIGHT; i++) {
			for (int j = 0; j <= i; j++) {
				List<String> line = i == 0 ? Arrays.asList(input.get(i)) : Arrays.asList(input.get(i).split(" "));
				triangle[i][j] = Integer.valueOf(line.get(j));
			}
		}

		for (int i = TRIANGLE_HEIGHT - 2; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				triangle[i][j] = triangle[i][j] + Math.max(triangle[i+1][j], triangle[i+1][j+1]);
			}
		}
		//System.out.println(triangle[0][0]);
		printTriangle(triangle);
		// System.out.println(input);
	}

	private static void printTriangle(Integer[][] triangle) {
		for (int i = 0; i < TRIANGLE_HEIGHT; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
	}

}
