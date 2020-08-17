package Problem14;

public class main {

	private long SEARCH_LIMIT = 1000000;

	public static void main(String[] args) {
		main solution = new main();
		System.out.println(solution.calculateSolution());
	}

	private long calculateSolution() {
		long result = 0;
		long maxNumberOfSteps = 0;
		long currentNumberOfSteps = 0;
		for (long i = 2; i <= SEARCH_LIMIT; i++) {
			currentNumberOfSteps = getNumberOfSteps(i);
			if (currentNumberOfSteps > maxNumberOfSteps) {
				maxNumberOfSteps = currentNumberOfSteps;
				result = i;
			}
			System.out.println("Current number: " + i);
		}
		return result;
	}

	private long getNumberOfSteps(long i) {
		long numberOfSteps = 0;
		while (i != 1) {
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i = 3 * i + 1;
			}
			numberOfSteps++;
		}
		return numberOfSteps;
	}

}
