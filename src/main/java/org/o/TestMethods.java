package org.o;

public class TestMethods {
    public int getPerimetr(int a, int b) {
        int perimetr = 2 * (a + b);
        return perimetr;

    }

    public int getSquare(int a, int b) {

        return a * b;
    }

    public int getSumOfDigits(int a) {
        int q1 = a % 10;
        int w1 = (a - q1) / 10;
        int q2 = w1 % 10;
        int w2 = (w1 - q2) / 10;
        int q3 = w2 % 10;
        int w3 = (w2 - q3) / 10;
        int q4 = w3 % 10;
        return q1 + q2 + q3 + q4;
    }

    public void interOfLines(int a, int b, int c, int d) {
        if (a == c) {
            if (b == d) {
                System.out.println("thea are equal");
            } else {
                System.out.println("parallel");

            }
        } else {
            double x = (double) (b - d) / (c - a);
            double y = (double) (a * x) + b;
            System.out.println("""
                    x, y""");
            System.out.println(x);
            System.out.println(y);
        }
    }

    public boolean isSquareInsideCircle(int r, int a) {
        double diag = a * Math.sqrt(2);

        return diag / 2 <= r;

    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }
    public int sum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
