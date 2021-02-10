/*
    CS 213 Project 1
    Authors: Prasidh Sriram & Manveer Singh
 */
package pkg;

public class RunProject1 {
    public static void main(String[] args) {
        //System.out.println("hi");
       // new Kiosk().run();
        Date date1 = new Date("31/2/2000");
        boolean test1 = date1.isValid();
        System.out.println("Test 1 result: " + test1);

        Date date2 = new Date("13/2/2020");
        boolean test2 = date2.isValid();
        System.out.println("Test 2 result: " + test2);

        Date date3 = new Date("2/29/2021");
        boolean test3 = date3.isValid();
        System.out.println("Test 3 result: " + test3);

        Date date4 = new Date("2/29/2009");
        boolean test4 = date4.isValid();
        System.out.println("Test 4 result: " + test4);

        Date date5 = new Date("4/31/2009");
        boolean test5 = date5.isValid();
        System.out.println("Test 5 result: " + test5);

        Date date6 = new Date("2/9/2021");
        boolean test6 = date6.isValid();
        System.out.println("Test 6 result: " + test6);

        Date date7 = new Date("3/31/1800");
        boolean test7 = date7.isValid();
        System.out.println("Test 7 result: " + test7);

        Date date8 = new Date("10/30/2022");
        boolean test8 = date8.isValid();
        System.out.println("Test 8 result: " + test8);

        Date date9 = new Date("1/32/2021");
        boolean test9 = date9.isValid();
        System.out.println("Test 9 result: " + test9);

        Date date10 = new Date("0200/23/404040");
        boolean test10 = date10.isValid();
        System.out.println("Test 10 result: " + test10);


    }
}
