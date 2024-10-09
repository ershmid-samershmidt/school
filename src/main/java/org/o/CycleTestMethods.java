package org.o;

public class CycleTestMethods{
    public int sum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public int sumOfDigits(int n) {
        int sum = 0;
        int r;
        int d = n;
        while (d != 0) {
            r = d % 10;
            d = (d - r) / 10;
            sum += r;

        }
        return sum;
    }
    public int luckyTickets() {
        int count = 0;
        for(int p = 0; p < 28; p++) {
            int combinationsForP = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        if (i + j + k == p) {
                            combinationsForP++;
                        }
                    }
                }
            }
            count += combinationsForP*combinationsForP;
        }



//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                for (int k = 0; k < 10; k++) {
//                    for (int l = 0; l < 10; l++) {
//                        for (int m = 0; m < 10; m++) {
//                            for (int n = 0; n < 10; n++) {
//                                if (i + j + k == l + m + n) {
//                                        count++;
//                                }
//
//                            }
//
//                        }
//
//                    }
//
//                }
//
//            }


    return count;
    }


}
