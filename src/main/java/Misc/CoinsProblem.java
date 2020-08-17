package Misc;
/*
 * You are given 10 piles of 10 coins each. 9 of the piles have 10 grams coins, while the last has 11 grams coins. Find the heaviest pile.
 */
public class CoinsProblem {

	public static void main(String[] args) {
		Integer[] coins = new Integer[10];
		for(int i=0; i<10; i++) {
			coins[i] = 100;
		}
		double random = Math.random();
		int differentIndex = (int)(random * 10);
		System.out.println(differentIndex);
		coins[differentIndex] = 110;
		
		int result = findHeaviest(coins);
		System.out.println("Pile number " + result + " is heavier");
	}
	
	private static int findHeaviest(Integer[] coins) {
		for(int i=0; i<10; i++) {
			coins[i] = coins[i] - coins[i]/10*i;
			if(coins[i] % 10 != 0) {
				return i+1;
			}
		}
		return 1;
	}

}
