package main.java.Misc;

import java.util.Arrays;
import java.util.List;

//Problem for Properly Nested strings
public class main {

	private Integer openedRound = 0;
	private Integer openedSquare = 0;
	private Integer openedCurly = 0;
	List<String> allowedChars = Arrays.asList("{", "[", "(", ")", "]", "}");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "";
		main solution = new main();
		System.out.println(solution.isProperlyNested(S));
	}

	private boolean isProperlyNested(String s) {
		for (int i = 0; i < s.length(); i++) {
			String currentBracket = String.valueOf(s.charAt(i));
			if (isAllowed(currentBracket)) {
				modifyBracketsState(currentBracket);
			} else {
				return false;
			}
		}
		if(areAllBracketsClosed()) {
			return true;
		}
		return false;
	}

	private boolean isAllowed(String s) {
		if (allowedChars.contains(s)) {
			return true;
		}
		return false;
	}
	
	private boolean areAllBracketsClosed() {
		if(openedRound == 0 && openedSquare == 0 && openedCurly == 0) {
			return true;
		}
		return false;
	}

	private void modifyBracketsState(String s) {
		switch (s) {
		case "{": {
			openedCurly++;
			allowedChars = Arrays.asList("{", "[", "(", "}");
			break;
		}
		case "[": {
			openedSquare++;
			allowedChars = Arrays.asList("{", "[", "(", "]");
			break;
		}
		case "(": {
			openedRound++;
			allowedChars = Arrays.asList("{", "[", "(", ")");
			break;
		}
		case ")": {
			openedRound--;
			allowedChars = Arrays.asList("{", "[", "(", ")", "]", "}");
			break;
		}
		case "]": {
			openedSquare--;
			allowedChars = Arrays.asList("{", "[", "(", ")", "]", "}");
			break;
		}
		case "}": {
			openedCurly--;
			allowedChars = Arrays.asList("{", "[", "(", ")", "]", "}");
			break;
		}
		}
	}
}
