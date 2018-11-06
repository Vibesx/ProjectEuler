package main.java.Problem16;

import java.math.BigInteger;

public class main {
	private static final Integer POWER = 1000;

	public static void main(String[] args) {
		BigInteger result = new BigInteger("1");
		int sum = 0;
		for(Integer i = 1; i<=POWER; i++) {
			result = result.multiply(new BigInteger("2"));
		}
		String resultAsString = result.toString();
		for(int i=0; i<resultAsString.length();i++) {
			sum += Integer.valueOf(String.valueOf(resultAsString.charAt(i)));
		}
		System.out.println(sum);
	}

}
