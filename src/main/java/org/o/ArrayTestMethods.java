package org.o;

public class ArrayTestMethods {
    public boolean hasNegative(int[] array) {
        boolean result = false;
        for (int elem: array) {
            if(elem < 0) {
                result = true;
                break;
            }
        }
        return result;
    }

}
