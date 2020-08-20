package util;

import java.util.ArrayList;
import java.util.List;

public class MiscUtils {
    public static void switchPlaces(Integer element1, Integer element2) {
        int aux;
        aux = element1;
        element1 = element2;
        element2 = aux;
    }

    public static List<Integer> generateArrayNumberFromLength(Integer length) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            result.add(i);
        }
        return result;
    }
}
