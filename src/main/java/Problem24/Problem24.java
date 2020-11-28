package Problem24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem24 {

    public static void main(String[] args) {
        long l = Long.parseLong("123456789");
        int count = 0;
        while(l != -1) {
            l = nextBiggerNumber(l);
            count++;
        }
        l = Long.parseLong("1023456789");
        for (int i = count; i < 999999; i++) {
            l = nextBiggerNumber(l);
        }
        System.out.println(l);
    }

    public static long nextBiggerNumber(long n) {
        String number = String.valueOf(n);
        List<String> digitList = Arrays.stream(number.split("")).collect(Collectors.toList());
        int listSize = digitList.size();
        for (int i = listSize - 1; i >= 1; i--) {
            if (Long.parseLong(digitList.get(i)) > Long.parseLong(digitList.get(i - 1))) {
                if(i == listSize - 1) {
                    Collections.swap(digitList, i, i - 1);
                } else {
                    orderRemaining(digitList, listSize, i - 1);
                }
                return Long.parseLong(String.join("", digitList));
            }
        }
        return -1;
    }

    private static void orderRemaining(List<String> digitList, int listSize, int i) {
        List<Long> remainingDigits = new ArrayList<>();
        long currentMin = Long.parseLong(digitList.get(i + 1));
        int indexOfMin = i + 1;
        for (int j = i + 1; j < listSize; j++) {
            if(Long.parseLong(digitList.get(j)) < currentMin && Long.parseLong(digitList.get(j)) > Long.parseLong(digitList.get(i))) {
                currentMin = Long.parseLong(digitList.get(j));
                indexOfMin = j;
            }
            remainingDigits.add(Long.parseLong(digitList.get(j)));

        }
        remainingDigits.add(Long.parseLong(digitList.get(i)));
        remainingDigits.remove(Long.parseLong(digitList.get(indexOfMin)));
        Collections.swap(digitList, i, indexOfMin);

        digitList.subList(i + 1, listSize).clear();
        remainingDigits = remainingDigits.stream()
                .sorted()
                .collect(Collectors.toList());
        digitList.addAll(remainingDigits.stream().map(String::valueOf).collect(Collectors.toList()));
    }





}


