package Problem15;

import java.math.BigInteger;

public class main {

	private static BigInteger result = new BigInteger("0");
	private static final Integer MATRIX_SIZE = 20;

	public static void main(String[] args) {
		//makeMove(0, 0, "");
		result = calculateSolution();
		System.out.println(result);
		//System.out.println(factorial(20));
		//System.out.println(calculateCombination(25, 3));
	}

	private static BigInteger calculateSolution() {
		Integer r = MATRIX_SIZE;
		Integer n = r*2;
		
		return calculateCombination(r, n);
	}

	private static BigInteger calculateCombination(Integer r, Integer n) {
		return factorial(n).divide((factorial(r).multiply(factorial(n - r))));
	}

	private static BigInteger factorial(Integer r) {
		BigInteger result = new BigInteger("1");
		for(BigInteger i = new BigInteger("1"); i.compareTo(new BigInteger(((Integer)(r + 1)).toString())) < 0; i = i.add(new BigInteger("1"))) {
			result = result.multiply(i);
		}
		return result;
	}

	//Recursive method that works decent for size ~15 matrixes... 20 takes days (no joke, tried it)
	/*private static void makeMove(int i, int j, String s) {
		if (i < MATRIX_SIZE) {
			//s += " down";
			int aux = i + 1;
			makeMove(aux, j, s + " down");
		}
		if (j < MATRIX_SIZE) {
			//s += " right";
			int aux = j + 1;
			makeMove(i, aux, s + " right");
		}
		if (i == MATRIX_SIZE && j == MATRIX_SIZE) {
			result++;
			System.out.println("Path was: " + s);
		}
	}*/

}
