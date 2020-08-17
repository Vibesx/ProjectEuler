package util;

public class MiscUtils {
    public static void switchPlaces(Integer element1, Integer element2) {
        int aux;
        aux = element1;
        element1 = element2;
        element2 = aux;
    }
}
