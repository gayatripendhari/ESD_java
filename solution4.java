/*
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the
fine (if any). The fee structure is as follows:

If the book is returned on or before the expected return date, no fine will be charged (i.e.: .fine =0;)

If the book is returned after the expected return day but still within the same calendar month and year as the expected return date,
fine = 15 x (number of days late).

If the book is returned after the expected return month but still within the same calendar year as the expected return date, the
fine = 500 x (number of months late) .

If the book is returned after the calendar year in which it was expected, there is a fixed fine of 
fine= 10000 .

 */

import java.io.*;
import java.util.*;

public class Solution4{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int dayExpected = sc.nextInt();
        int monthExpected = sc.nextInt();
        int yearExpected = sc.nextInt();
        int fine = 0;
        
        if(year > yearExpected){
            fine = 10000;
        }else if(year == yearExpected && month > monthExpected){
            fine = (month - monthExpected) * 500;
        }else if(year == yearExpected && month == monthExpected && day > dayExpected){
            fine = (day - dayExpected) * 15;
        }
        System.out.println(fine);
    }
}