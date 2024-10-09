package org.o;

import org.apache.commons.lang3.StringUtils;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TestMethods methods = new TestMethods();
        // System.out.println("perimetr");
        // int per = methods.getPerimetr(5, 10);
        // System.out.println(per);

        // System.out.println("square");
        // int sq = methods.getSquare(5, 10);
        // System.out.println(sq);

        // System.out.println("summa");
        //System.out.println(methods.getSumOfDigits(1234));
        // System.out.println(methods.getSumOfDigits(5915));

        // methods.interOfLines(3, 2, 3, 4);
        // methods.interOfLines(3, 2, 3, 2);
        // methods.interOfLines(1, 1, 5, 4);


        //  System.out.println(methods.isSquareInsideCircle(10, 1));
        // System.out.println(methods.isSquareInsideCircle(1, 10));


        // System.out.println(methods.max(3, 2));

        //CycleTestMethods methods = new CycleTestMethods();


        //System.out.println(methods.sum(5));
        // System.out.println(methods.sumOfDigits(123456789));
        // System.out.println(methods.luckyTickets());


        //ArrayTestMethods methods = new ArrayTestMethods();
        //int[] arr1 = {1, 2 ,-4, 10};
        // int[] arr2 = {1, 2, 4, 10};
        // System.out.println(methods.hasNegative(arr1));
        // System.out.println(methods.hasNegative(arr2));


        Point2D point1 = new Point2D();
        System.out.println("x coordinate:" + point1.getX());
        System.out.println("y= " + point1.getY());


        point1.moveTo(10, 15);
        System.out.println("x coordinate:" + point1.getX());
        System.out.println("y= " + point1.getY());

        Point2D point2 = new Point2D(10, 15);
        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));


        Factorial f = new Factorial();
        System.out.println(f.fact(5));
    }

}