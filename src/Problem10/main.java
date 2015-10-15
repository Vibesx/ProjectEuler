package Problem10;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main solution = new main();
		System.out.println(solution.calculateSolution());
	}

	private long calculateSolution() {
		long sum = 0;
		//note to dumb self: 1 is not prime >.>
		for(long i = 2; i<=2000000; i++) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		return sum;
	}
	
	private boolean isPrime(long a) {
		if(a>3) {
			for(int i=2; i<=Math.sqrt(a); i++) {
				if(a%i==0) {
					return false;
				}
			}
		}
		return true;
	}
}
