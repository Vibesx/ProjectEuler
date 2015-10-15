package Problem12;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer number = 9500;
		Integer triangleNumber = 0;
		Boolean found = false;
		while (!found) {
			triangleNumber = calculateTriangleNumber(number);
			if(isValid(triangleNumber)) {
				System.out.println(triangleNumber);
				found = true;
			} else {
				number++;
			}
			System.out.println(number);
		}
	}
	
	private static Integer calculateTriangleNumber(Integer number) {
		Integer result = 0;
		for(int i=1; i<=number; i++) {
			result = result + i;
		}
		//System.out.println("Triangle Number: " + result);
		return result;
	}

	private static Boolean isValid(Integer number) {
		Integer numberOfDivisors = 0;
		for (int i = number / 2; i >= 1; i--) {
			if(number % i == 0) {
				numberOfDivisors++;
			}
		}
		if(numberOfDivisors > 400) {
			System.out.println("Number of divisors: " + numberOfDivisors);	
		}
		
		if(numberOfDivisors > 500) {
			return true;
		}
		return false;
	}
}
