package Problem17;

import java.util.HashMap;
import java.util.Map;

public class main {
	private static Map<Integer, Integer> numbersLength = new HashMap<>();

	public static void main(String[] args) {
		populateNumbersLength(numbersLength);
		Integer result = calculateSum(numbersLength);
		System.out.println(result);
	}
	
	private static Integer calculateSum(Map<Integer, Integer> numbersLength) {
		Integer sum = 0;
		for(int i=1; i<=1000; i++) {
			if(i>=1 && i<=19) {
				sum += numbersLength.get(i);
			} else if(i>=20 && i<=99) {
				sum += twoDigitCalculation(i);
			} else if(i>=100 && i<=999) {
				int andWord = i%100 != 0 ? 3 : 0;
				int thirdDigitCount = numbersLength.get(i/100) + numbersLength.get(100);
				int firstAndSecondDigitCount = 0;//i%100 > 19 ? numbersLength.get(i%100 / 10 * 10) : 0;
				if(i%100 < 20 && i%100 != 0) {
					firstAndSecondDigitCount = numbersLength.get(i%100);
				} else if(i%100 != 0){
					int firstDigitCount = i%10 != 0 ? numbersLength.get(i%10) : 0;
					firstAndSecondDigitCount = twoDigitCalculation(i%100 / 10 * 10) + firstDigitCount;
				}
				/*if(i%100 < 9) {
					secondDigitCount = 0;
				} else if(i%100 > 9 && < 20) {
					
				}*/
				//int firstDigitCount = i%10 != 0 ? numbersLength.get(i%10) : 0;
				sum += thirdDigitCount + andWord + firstAndSecondDigitCount;
			} else if(i == 1000) {
				sum += numbersLength.get(1000) + numbersLength.get(1);
			}
		}
		return sum;
	}

	private static Integer twoDigitCalculation(int i) {
		int sum = 0;
		int secondDigitCount = numbersLength.get(i/10 * 10);
		int firstDigitCount = i%10 != 0 ? numbersLength.get(i%10) : 0;
		sum += secondDigitCount + firstDigitCount;
		return sum;
	}

	private static void populateNumbersLength(Map<Integer, Integer> numbersLength) {
		numbersLength.put(1, 3);
		numbersLength.put(2, 3);
		numbersLength.put(3, 5);
		numbersLength.put(4, 4);
		numbersLength.put(5, 4);
		numbersLength.put(6, 3);
		numbersLength.put(7, 5);
		numbersLength.put(8, 5);
		numbersLength.put(9, 4);
		numbersLength.put(10, 3);
		numbersLength.put(11, 6);
		numbersLength.put(12, 6);
		numbersLength.put(13, 8);
		numbersLength.put(14, 8);
		numbersLength.put(15, 7);
		numbersLength.put(16, 7);
		numbersLength.put(17, 9);
		numbersLength.put(18, 8);
		numbersLength.put(19, 8);
		numbersLength.put(20, 6);
		numbersLength.put(30, 6);
		numbersLength.put(40, 5);
		numbersLength.put(50, 5);
		numbersLength.put(60, 5);
		numbersLength.put(70, 7);
		numbersLength.put(80, 6);
		numbersLength.put(90, 6);
		numbersLength.put(100, 7);
		numbersLength.put(1000, 8);
	}

}
