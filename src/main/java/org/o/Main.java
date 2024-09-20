package org.o;

import org.apache.commons.lang3.StringUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TestMethods methods = new TestMethods();
        System.out.println("perimetr");
        int per = methods.getPerimetr(5, 10);
        System.out.println(per);

        System.out.println("square");
        int sq = methods.getSquare(5, 10);
        System.out.println(sq);

        System.out.println("summa");
        System.out.println(methods.getSumOfDigits(1234));
        System.out.println(methods.getSumOfDigits(5915));

        methods.interOfLines(3, 2, 3, 4);
        methods.interOfLines(3, 2, 3, 2);
        methods.interOfLines(1, 1, 5, 4);


        System.out.println(methods.isSquareInsideCircle(10, 1));
        System.out.println(methods.isSquareInsideCircle(1, 10));


        System.out.println(methods.max(3, 2));
    }



}